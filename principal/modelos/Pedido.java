package principal.modelos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido extends Cardapio {

    Scanner scanner = new Scanner(System.in);

    Informacoes infos = new Informacoes();
    FileManager file = new FileManager();
//    Cardapio cardapio = new Cardapio();
//    List<Cardapio> cardapios = Informacoes.cardapios();

    private List<Pedido> pedidos;
    private List<String> itens;
    private String nomeCliente;
    private String prato;
    private String bebida;
    private String sobremesa;
    private String valorTotalProdutos;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Pedido(String nomeCliente, List<String> itens) {
    }

    public void adicionarPedido() throws IOException{

        System.out.println("----------CARDÁPIO-----------");
        listarCardapio();
        System.out.println("-----------------------------");

//        Boolean op = true;
//
//        do {
//
//            System.out.println("Escolha o que deseja do cardápio: ");
//            var ped = scanner.nextLine();
//
//            for (Cardapio pedido1 : pedidos){
//                if(pedido1.getNomePrato().equals(ped)){
//                    pedidos.add();
//                    salvarPedido(pedido);
//                    op = false;
//                } else {
//                    System.out.println("Produto não encontrado!");
//                    op = true;
//                }
//            }
//
//        }while (!op);
//
//
//        for (Pedido pedido1 : pedidos) {
//            System.out.println(pedidos);
//        }

//        System.out.print("Qual o nome do cliente: ");
//        nomeCliente = scanner.nextLine();
//
//        System.out.print("Qual o prato principal: ");
//        prato = scanner.nextLine();
//
//        System.out.print("Qual a bebida: ");
//        bebida = scanner.nextLine();
//
//        System.out.print("Qual a sobremesa: ");
//        sobremesa = scanner.nextLine();
//
//        System.out.print("Qual o valor total desse pedido: ");
//        valorTotalProdutos = scanner.nextLine();
//
//        pedidos.add(pedido);
//        salvarPedido(pedido);
    }

//    public double getValorTotal() {
//        double total = 0.0;
//        for (Produto produto : itens) {
//            total += produto.getPreco();
//        }
//        return total;
//    }

    private void salvarPedido(Pedido pedido) throws IOException {

        String diretorioCLIENTE = "C:\\Restaurante\\Listas";
        String Arquivo = "Pedido" + nomeCliente + ".txt";

        File diretorioClient = criarDiretorio(diretorioCLIENTE);
        File arquivo = criarArquivo(diretorioClient, Arquivo);

        FileWriter fileWriter = new FileWriter(arquivo);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write("Pedido de: " + nomeCliente);
        writer.newLine();
        writer.write("Itens: " + prato + ", " + bebida + ", " + sobremesa);
        writer.newLine();
        writer.write("Valor total: " + valorTotalProdutos);
        writer.newLine();

        for (String item : pedido.getItens()) {
            writer.write("- " + item);
            writer.newLine();
        }

        writer.close();
        fileWriter.close();

        System.out.println("Pedido salvo em: " + arquivo);
    }

    private String[] getItens() {

        return new String[0];
    }

    private String getNomeCliente() {
        return nomeCliente;
    }

    private class Pedidos {
        private String nomeCliente;
        private List<String> itens;

        public Pedidos(String nomeCliente, List<String> itens) {
            this.nomeCliente = nomeCliente;
            this.itens = itens;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public List<String> getItens() {
            return itens;
        }
    }

    public File criarDiretorio(String diretorioCARD) {
        File diretorio = new File(diretorioCARD);
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }
        return diretorio;
    }

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

}

//
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Pedido{
//
//    Scanner scanner = new Scanner(System.in);
//
//    Cliente cliente = new Cliente();
//
//    Cardapio cardapio = new Cardapio();
//
//    protected String nomeCliente;
//    protected String pedidoPrato;
//    protected String pedidoBebida;
//    protected String pedidoSobremesa;
//
////    List<Funcionario> funcionario = Informacoes.listaFuncionarios();
////
////    List<Cliente> clientes = Informacoes.listaClientes();
////
////    List<Cardapio> cardapios = Informacoes.cardapios();
//
//    public void pedidoCliente() throws IOException{
//
//        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
//
//        File arquivo = new File(caminhoArquivo);
//        FileReader fileReader = new FileReader(arquivo);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String prato = "";
//        String bebida = "";
//        String sobremesa = "";
//        int linhaNum = 0;
//
//        System.out.println("Qual o nome do cliente que quer fazer o pedido?");
//        nomeCliente = scanner.nextLine();
//
//        System.out.println("Qual prato deseja pedir?");
//        pedidoPrato = scanner.nextLine();
//
//        while (bufferedReader.ready()) {
//            prato = bufferedReader.readLine();
//            linhaNum++;
//            if (prato.contains(pedidoPrato)) {
//                pedidoPrato = prato;
//            }
//        }
//
//        System.out.println("Qual bebida deseja pedir?");
//        pedidoBebida = scanner.nextLine();
//
//        while (bufferedReader.ready()) {
//            bebida = bufferedReader.readLine();
//            linhaNum++;
//            if (bebida.contains(pedidoBebida)) {
//                pedidoBebida = bebida;
//            }
//        }
//
//        System.out.println("Qual sobremesa deseja pedir?");
//        pedidoSobremesa = scanner.nextLine();
//
//        while (bufferedReader.ready()) {
//            sobremesa = bufferedReader.readLine();
//            linhaNum++;
//            if (sobremesa.contains(pedidoSobremesa)) {
//                pedidoSobremesa = sobremesa;
//            }
//        }
//
//        System.out.println(nomeCliente + " " + prato + " " + bebida + " " + sobremesa);
//
//        bufferedReader.close();
//        fileReader.close();
//
//    }
//

//    public void contaClientes(Integer id, int numPrato, int numBebida, int numSobremesa){
//
////        Double total = valorPrato + valorBebida + valorSobremesa;
//
//        System.out.println("Qual o ID do cliente que quer pedir a conta?");
//        var cliente = scanner.nextInt();
//
//        //Verificador para puxar arquivo txt para analisar se existe o cliente e o que ele tem no pedido e fechar a conta
//        for (Cliente cliente1 : clientes /*Aqui temos que colocar o arquivo txt para verificar e fazer o processo abaixo*/) {
//            if (/*arquivo txt */ == cliente){
//
//                System.out.println("*************************");
//                System.out.println("**********NOTA***********");
//                System.out.println("Produtos pedidos");
//                System.out.println("comida");
//                System.out.println("******" + numPrato + "******");
//                System.out.println("******" + numBebida + "******");
//                System.out.println("******" + numSobremesa + "******");
//                System.out.println("Valor final: "/* + total*/);
//                System.out.println("*************************");
//
//                break;
//
//            } else {
//
//                System.out.println("Cliente não existe!");
//
//                break;
//            }
//        }
//
//    }

//}
