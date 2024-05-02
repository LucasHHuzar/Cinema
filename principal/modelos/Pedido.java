package principal.modelos;


import java.util.Scanner;

public class Pedido {

    Scanner scanner = new Scanner(System.in);

    Cliente cliente = new Cliente();
//    Cardapio cardapio = new Cardapio();

    public void pedidoCliente(){

        System.out.println("Qual o nome do cliente?");
        var nome = scanner.nextLine();

        System.out.println("Qual a mesa do cliente?");
        var mesa = scanner.nextInt();

        for (Cliente cliente1 : cliente.clientes) {
            if (nome == cliente.getNome() && mesa == cliente.getMesa()){
                    System.out.println("Qual o pedido?");
            } else {
                System.out.println("Cliente não existe!");
            }
        }

        scanner.close();

    }

}
