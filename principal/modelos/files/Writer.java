package principal.modelos.files;

import principal.modelos.Cardapio;
import principal.modelos.Cliente;
import principal.modelos.Funcionario;
import principal.modelos.Informacoes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

    public class Writer {

        Informacoes info = new Informacoes();

        //criando diretorio e arquivo
        public void criarDiretorioEArquivo() {
            String diretorioCARD = "C:\\Users\\autologon\\LISTA";
            String ArquivoCard = "ListaCardapio.txt";

            File diretorioCard = criarDiretorio(diretorioCARD);
            File arquivoCard = criarArquivo(diretorioCard, ArquivoCard);


            String diretorioFUNC = "C:\\Users\\autologon\\LISTA";
            String ArquivoFunc = "ListaFuncionarios.txt";

            File diretorioFunc = criarDiretorio(diretorioFUNC);
            File arquivoFunc = criarArquivo(diretorioFunc, ArquivoFunc);


            String diretorioCLIENTE = "C:\\Users\\autologon\\LISTA";
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
    }
}
