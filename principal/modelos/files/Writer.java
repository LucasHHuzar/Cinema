package principal.modelos.files;

import principal.modelos.Cardapio;
import principal.modelos.Cliente;
import principal.modelos.Funcionario;
import principal.modelos.Informacoes;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Writer {

        Informacoes info = new Informacoes();

        //criando diretorio e arquivo
        public void criarDiretorioEArquivo() {
            String diretorioCARD = "C:\\Restaurante\\Listas";
            String ArquivoCard = "ListaCardapio.txt";

            File diretorioCard = criarDiretorio(diretorioCARD);
            File arquivoCard = criarArquivo(diretorioCard, ArquivoCard);


            String diretorioFUNC = "C:\\Restaurante\\Listas";
            String ArquivoFunc = "ListaFuncionarios.txt";

            File diretorioFunc = criarDiretorio(diretorioFUNC);
            File arquivoFunc = criarArquivo(diretorioFunc, ArquivoFunc);


            String diretorioCLIENTE = "C:\\Restaurante\\Listas";
            String Arquivo = "ListaCliente.txt";

            File diretorioClient = criarDiretorio(diretorioCLIENTE);
            File arquivo = criarArquivo(diretorioClient, Arquivo);

        }

        //criando diretorio

        public File criarDiretorio(String diretorioCARD) {
            File diretorio = new File(diretorioCARD);
            if (!diretorio.exists()) {
                diretorio.mkdir();
            }
            return diretorio;
        }

        //criar arquivo

        public File criarArquivo(File diretorio, String nomeArquivo) {
            File arquivo = new File(diretorio, nomeArquivo);
            try {
                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arquivo;
        }

        public void gravarDadosCard(File file, List<Cardapio> cardapios) {
            try (FileWriter fileWriter = new FileWriter(file, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {

                for (Cardapio cardapio : cardapios) {
                    printWriter.println(cardapio.getTipoPrato() + "," + cardapio.getNumProduto() + "," + cardapio.getNomePrato() + "," +
                            cardapio.getBebida() + "," + cardapio.getSobremesa() + "," + cardapio.getValor());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void gravarDadosFunc(File file, List<Funcionario> funcionarios) {
            try (FileWriter fileWriter = new FileWriter(file, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {

                for (Funcionario funcionario : funcionarios) {
                    printWriter.println(funcionario.getNome() + "," + funcionario.getNumIdentifiFuncionario() + "," + funcionario.getCargo());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void gravarDadosCliente(File file, List<Cliente> clientes) {
            try (FileWriter fileWriter = new FileWriter(file, true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {

                for (Cliente cliente : clientes) {
                    printWriter.println(cliente.getNome() + "," + cliente.getId());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Excluir um item específico de um arquivo de texto
        public void removerItemArquivo(String arquivoCaminho, String itemParaRemover) throws IOException {
            System.out.println("Item a ser removido: " + itemParaRemover);

            Path filePath = Paths.get(arquivoCaminho);
            List<String> linhas = Files.readAllLines(filePath, StandardCharsets.UTF_8);

            // Imprimir as linhas antes de remover o item
            System.out.println("Linhas antes da remoção:");
            for (String linha : linhas) {
                System.out.println(linha);
            }

            linhas.removeIf(line -> line.trim().equals(itemParaRemover));

            // Imprimir as linhas depois de remover o item
            System.out.println("==========================");
            System.out.println("Linhas depois da remoção:");
            for (String linha : linhas) {
                System.out.println(linha);
            }

            Files.write(filePath, linhas, StandardCharsets.UTF_8);
            System.out.println("Item removido com sucesso!");
        }


        // Listar itens de um arquivo de texto de maneira ordenada
        public List<String> listarItensOrdenados(File arquivo) throws IOException {
            List<String> itens = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));

            String linha = null;
            while ((linha = reader.readLine()) != null) {
                itens.add(linha);
            }

            if (reader != null) {
                reader.close();
            }

            Collections.sort(itens);
            return itens;
        }

    }

