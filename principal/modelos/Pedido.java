package principal.modelos;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido extends Garcom{

    Scanner scanner = new Scanner(System.in);

    Cliente cliente = new Cliente();

    List<Funcionario> funcionario = Informacoes.listaFuncionarios();

    List<Cliente> clientes = Informacoes.listaClientes();

    public void pedidoCliente(){

    }

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

    public class salvarArquivoPedido {
        public static void salvar(String dadosPedido) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/files/pedidos.txt", true));
            writer.write(dadosPedido);
            writer.newLine();
            writer.close();
        }
    }

    public class addPedidos {
        public static void verificarSeDaCerto() throws IOException {

            List<Cliente> clientes = Informacoes.listaClientes();

            Scanner scanner = new Scanner(System.in);

            Integer id;

            System.out.println("Qual o ID do cliente?");
            id = scanner.nextInt();

            for (Cliente cliente1 : clientes) {
                if (cliente1.getId().equals(id)){

                    //Salva algumas informações no arquivo

                    System.out.println("Qual o número do prato?");
                    int numPrato = scanner.nextInt();
                    salvarArquivoPedido.salvar(String.valueOf(numPrato));

                    System.out.println("Qual a bebida?");
                    int numBebida = scanner.nextInt();
                    salvarArquivoPedido.salvar(String.valueOf(numBebida));

                    System.out.println("Qual a sobremesa?");
                    int numSobremesa = scanner.nextInt();
                    salvarArquivoPedido.salvar(String.valueOf(numSobremesa));

                    break;

                } else {

                    System.out.println("Cliente não existe!");

                    break;
                }
            }

            scanner.close();

            // Verifica se uma informação está presente no arquivo
            boolean encontrado = verificadorArquivo.verificar("João");
            if (encontrado) {
                System.out.println("A informação foi encontrada no arquivo.");
            } else {
                System.out.println("A informação não foi encontrada no arquivo.");
            }
        }
    }

    public class verificadorArquivo {
        public static boolean verificar(String informacaoProcurada) throws IOException {

            File arquivo = new File("pedidos.txt");

            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado.");
            }

            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains(informacaoProcurada)) {
                    scanner.close();
                    return true;
                }
            }
            scanner.close();
            return false;
        }
    }

}
