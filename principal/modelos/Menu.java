package principal.modelos;

import java.io.IOException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu extends Gerente {

    //criando menu...
    //Estou criando menu dentro de outro menu
    public void menu() throws IOException {

        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        Cardapio cardapio = new Cardapio();
        FileManager file = new FileManager();

        int op;

        do {
            System.out.println("==============================");
            System.out.println("Menu:");
            System.out.println("1. Cliente");
            System.out.println("2. Gerente");
            System.out.println("3. Pedido");
            System.out.println("4. Pesquisar");
            System.out.println("5. Adicionar");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            int menu1;
            int menu2;
            int menu3;
            int menu4;
            int menu5;
            int menu6;

            boolean returnMenu = false;

            switch (op) {
                case 1:
//                    boolean continueClienteMenu = true;
//                    while (continueClienteMenu) {
//                        System.out.println("==============================");
//                        System.out.println("Menu CLIENTE:");
//                        System.out.println("1. Adicionar Cliente");
//                        System.out.println("2. Mostrar Clientes");
//                        System.out.println("3. Voltar para o MENU");
//                        menu1 = scanner.nextInt();
//
//                        switch (menu1) {
//                            case 1:
//                                file.adicionarClientes();
//                                break;
//                            case 2:
//                                cliente.listarClientes();
//                                break;
//                            case 3:
//                                continueClienteMenu = false;
//                                break;
//                            default:
//                                System.out.println("Opção inválida. Tente novamente.");
//                        }
//                    }
//                    break;

                    do {
                        System.out.println("==============================");
                        System.out.println("Menu CLIENTE:");
                        System.out.println("1. Adicionar Cliente");
                        System.out.println("2. Mostrar Clientes");
                        System.out.println("3. Voltar para o MENU");
                        menu1 = scanner.nextInt();

                        switch (menu1) {
                            case 1:
                                file.adicionarClientes();
                                break;
                            case 2:
                                cliente.listarClientes();
                                break;
                            case 3:
                                System.out.println("...");
                                returnMenu = true;
                        }

                    } while (!returnMenu);
                    break;

                case 2:
                    do {
                        System.out.println("==============================");
                        System.out.println("Menu GERENTE:");
                        System.out.println("1. Mostrar Funcionarios");
                        System.out.println("2. Adicionar Funcionário");
                        System.out.println("3. !Demitir Funcionario!");
                        System.out.println(" ");
                        System.out.println("4. Mostrar Clientes");
                        System.out.println("5. !Tirar Clientes!");
                        System.out.println(" ");
                        System.out.println("6. Mostrar CARDAPIO");
                        System.out.println("7. !Tirar algo do Cardapio!");
                        System.out.println(" ");
                        System.out.println("8. Sair");
                        menu2 = scanner.nextInt();

                        switch (menu2) {
                            case 1:
                                //mostrando lista de funcionarios
                                listarFunc();
                                break;

                            case 2:
                                //mostrando lista de funcionarios
                                file.adicionarFunc();
                                break;

                            case 3:
                                //codigo para remocao do funcionario da lista
                                demitirFunc();
                                break;

                            case 4:
                                //mostrando lista dos clientes
                                cliente.listarClientes();
                                break;
                            case 5:
                                //codigo para remocao de cliente da lista
                                removerCliente();
                                break;
                            case 6:
                                //mostrando lista do cardapio
                                cardapio.listarCardapio();
                                break;
                            case 7:
                                //codigo para remocao de qualquer coisa do cardapio
                                removerCliente();
                                break;
                            case 8:
                                returnMenu = true;
                        }

                    } while (!returnMenu);

                    break;

                case 3:

                    System.out.println("=========================");
                    System.out.println("=========CARDÁPIO========");
                    cardapio.listarCardapio();
                    System.out.println("=========================");

                    // Obter a lista de cardápios
                    List<Cardapio> cardapios = Informacoes.cardapios();

                    // Criar o Map<Integer, Cardapio>
                    Map<Integer, Cardapio> cardapioMap = new HashMap<>();
                    for (Cardapio cardapio1 : cardapios) {
                        cardapioMap.put(cardapio1.getNumProduto(), cardapio1);
                    }

                    // Criar o PedidoManager e executar o pedido
                    Pedido pedidos = new Pedido(cardapioMap);
                    pedidos.fazerPedido();

                    break;

                case 4:

                    System.out.println("1. Pesquisar Cliente");
                    System.out.println("2. Pesquisar Funcionario");
                    System.out.println("3. Pesquisar no Cardapio");
                    System.out.println("4. Sair");

                    do {
                        // esse if verifica se o que o usuário digitou pode ser entendido como um número inteiro
                        if (scanner.hasNextInt()) {
                            int menui = scanner.nextInt();
                            scanner.nextLine();

                            switch (menui) {
                                case 1:
                                    file.pesquisarArquivoCliente();
                                    break;
                                case 2:
                                    file.pesquisarArquivoFunc();
                                    break;
                                case 3:
                                    file.pesquisarArquivoCard();
                                    break;
                                case 4:
                                    returnMenu = true;
                                    break;
                            }
                        }

                    } while (!returnMenu);
                    break;

                case 5:
                    System.out.println("1. Adicionar Cliente");
                    System.out.println("2. Adicionar Funcionario");
                    System.out.println("3. Sair");
                    do {
                        if (scanner.hasNextInt()) {
                            menu6 = scanner.nextInt();
                            switch (menu6) {
                                case 1:
                                    file.adicionarClientes();
                                    break;
                                case 2:
                                    file.adicionarFunc();
                                    break;
                                case 3:
                                    returnMenu = true;
                                    break;
                            }
                        }

                    } while (!returnMenu);
                    break;
                case 6:
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (op != 6);

        scanner.close();
    }

}
