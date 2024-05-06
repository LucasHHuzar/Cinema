package principal.modelos;


import java.util.List;
import java.util.Scanner;

public class Pedido {

    Scanner scanner = new Scanner(System.in);

    Cliente cliente = new Cliente();

    List<Funcionario> funcionario = Informacoes.listaFuncionarios();

    List<Cliente> clientes = Informacoes.listaClientes();

//    Cardapio cardapio = new Cardapio();

    public void pedidoCliente(){

        System.out.println("Qual o nome do cliente?");
        var nome = scanner.nextLine();

        for (Cliente cliente1 : clientes) {
            if (nome.equals()){
                    System.out.println("Qual o pedido?");
                    break;
            } else {
                System.out.println("Cliente não existe!");
                break;
            }
        }

        scanner.close();

    }

}
