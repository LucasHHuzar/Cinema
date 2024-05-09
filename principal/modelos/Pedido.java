package principal.modelos;

import java.io.*;
import java.util.*;

public class Pedido extends Cardapio {

    Scanner scanner = new Scanner(System.in);

    Informacoes infos = new Informacoes();
    FileManager file = new FileManager();
//    Cardapio cardapio = new Cardapio();
//    List<Cardapio> cardapios = Informacoes.cardapios();

    private String nomeCliente;

    private Map<Integer, Cardapio> cardapioMap;

    public Pedido(){ }

    public Pedido(Map<Integer, Cardapio> cardapioMap) {
        this.cardapioMap = new HashMap<>();
        inicializarCardapioMap();
    }

    private void inicializarCardapioMap() {
        // Obter a lista de cardápios
        List<Cardapio> cardapios = Informacoes.cardapios();

        // Criar o Map<Integer, Cardapio>
        for (Cardapio cardapio : cardapios) {
            cardapioMap.put(cardapio.getNumProduto(), cardapio);
        }
    }

    public void fazerPedido() throws IOException{

        Scanner scanner = new Scanner(System.in);

        double totalPedido = 0.0;

        System.out.print("Qual o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        String diretorioCLIENTE = "C:\\Restaurante\\Listas";
        String Arquivo = "Pedido" + nomeCliente + ".txt";

        File diretorioClient = criarDiretorio(diretorioCLIENTE);
        File arquivo = criarArquivo(diretorioClient, Arquivo);

        FileWriter fileWriter = new FileWriter(arquivo);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        while (true) {
            System.out.print("Digite o número do produto que deseja pedir (ou 0 para finalizar): ");
            int numProduto = scanner.nextInt();
            scanner.nextLine();

            if (numProduto == 0) {
                break;
            }

            Cardapio produto = cardapioMap.get(numProduto);

            if (produto != null) {
                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                totalPedido += produto.getValor() * quantidade;



                // Caminho completo do arquivo
                String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaCardapio.txt";

                // Abrir o arquivo e pesquisar
                File arquivos = new File(caminhoArquivo);
                FileReader fileReader = new FileReader(arquivos);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = "";
                int linhaNumero = 0;


                while (bufferedReader.ready()) {
                    linha = bufferedReader.readLine();
                    linhaNumero++;
                    if (linha.contains(String.valueOf(numProduto))) {
                        System.out.println("Encontrado na linha " + linhaNumero + ": " + linha);
                        break;
                    }
                }

                System.out.println("Produto adicionado: " + linha + " - Quantidade: " + quantidade);

                writer.write("Pedido de: " + nomeCliente);
                writer.newLine();
                writer.write("Itens: " + linha + " ");
                writer.newLine();
                writer.write("Valor total: " + totalPedido);
                writer.newLine();
                writer.write(" ");
                writer.newLine();

                bufferedReader.close();
                fileReader.close();

            } else {
                System.out.println("Produto não encontrado no cardápio.");
            }
        }

        System.out.println("Total do pedido: R$ " + totalPedido);
        // Aqui você pode chamar o método para salvar o pedido

        System.out.println("Pedido salvo em: " + arquivo);

        writer.close();
        fileWriter.close();
    }

    public File criarDiretorio(String diretorioCARD) {

        File diretorio = new File(diretorioCARD);

        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        return diretorio;
    }

    public File criarArquivo(File diretorio, String nomeArquivo) throws IOException {

        File arquivo = new File(diretorio, nomeArquivo);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        return arquivo;
    }

}