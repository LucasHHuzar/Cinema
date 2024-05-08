package principal.modelos;

import principal.PrincipalTestes;
import principal.modelos.files.Reader;
import principal.modelos.files.Writer;

import java.io.IOException;
import java.util.List;

import java.util.Scanner;

public class Menu extends Gerente {

    //criando menu...
        //Estou criando menu dentro de outro menu
    public void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Cardapio cardapio = new Cardapio();
        Reader reader = new Reader();

        int op;

        do {
            System.out.println("==============================");
            System.out.println("Menu:");
            System.out.println("1. Cliente");
            System.out.println("2. Gerente");
            System.out.println("3. Funcionario");
            System.out.println("4. Pesquisar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            int menu1;
            int menu2;
            int menu3;
            int menu4;
            int menu5;

            boolean returnMenu = false;

            switch (op) {
                case 1:
                    do{
                        System.out.println("==============================");
                        System.out.println("Menu CLIENTE:");
                        System.out.println("1. Cardápio");
                        System.out.println("2. pesquisar na lista");//Tirar pedido e adicionar no menu do garçom
                        System.out.println("4. Mostrar Clientes");
                        System.out.println("5. Voltar para o MENU");
                        menu1 = scanner.nextInt();

                        switch (menu1){
                            case 1:
                                cardapio.listarCardapio();
                                break;
                            case 2:
//                                reader.pesquisarArquivo();
                                break;
                            case 3:
                                System.out.println("PEDINDO A CONTA");
                                break;
                            case 4:
                                cliente.listarCliestes();
                            case 5:
                                System.out.println("...");
                                returnMenu = true;
                        }

                    }while (!returnMenu);
                    break;

                case 2:
                    do {
                        System.out.println("==============================");
                        System.out.println("Menu GERENTE:");
                        System.out.println("1. Mostrar Funcionarios");
                        System.out.println("2. !Demitir Funcionario!");
                        System.out.println(" ");
                        System.out.println("3. Mostrar Clientes");
                        System.out.println("4. !Tirar Clientes!");
                        System.out.println(" ");
                        System.out.println("5. Mostrar CARDAPIO");
                        System.out.println("6. !Tirar algo do Cardapio!");
                        System.out.println(" ");
                        System.out.println("7. Sair");
                        menu2 = scanner.nextInt();

                        switch (menu2){
                            case 1:
                                //mostrando lista de funcionarios
                                listarFunc();
                                break;
                            case 2:
                                //codigo para remocao do funcionario da lista
                                demitirFunc();
                                break;
                            case 3:
                                //mostrando lista dos clientes
                                cliente.listarCliestes();
                                break;
                            case 4:
                                //codigo para remocao de cliente da lista
                                removerCliente();
                                break;
                            case 5:
                                //mostrando lista do cardapio
                                cardapio.listarCardapio();
                                break;
                            case 6:
                                //codigo para remocao de qualquer coisa do cardapio
                                removerCliente();
                                break;
                            case 7:
                                returnMenu = true;
                        }

                    }while (!returnMenu);

                    break;
                case 3:
                    do {
                        System.out.println("==============================");
                        System.out.println("Menu Funcionário:");
                        System.out.println("1. Garçom");
                        System.out.println("2. Caixa");
                        System.out.println("3. Sair");
                        menu3 = scanner.nextInt();

                        switch (menu3){
                            case 1:
                                do {
                                    System.out.println("==============================");
                                    System.out.println("Menu Garçom:");
                                    System.out.println("1. Cardapio");
                                    System.out.println("2. Pedido");
                                    System.out.println("3. Conta");
                                    System.out.println("4. Sair");
                                    menu4 = scanner.nextInt();

                                    switch (menu4){
                                        case 1:
                                            cardapio.listarCardapio();
                                            break;
                                        case 2:
                                            System.out.println("PEDIDO");
                                            break;
                                        case 3:
                                            System.out.println("CONTA");
                                            break;
                                        case 4:
                                            returnMenu = true;
                                    }

                                }while (!returnMenu);
                                break;

                            case 2:
                                do {
                                    System.out.println("==============================");
                                    System.out.println("Menu Atendente Caixa:");
                                    System.out.println("1. Conta");
                                    System.out.println("2. Qual a forma de pagamento?");
                                    System.out.println("3. Sair");
                                    menu5 = scanner.nextInt();

                                    switch (menu5) {
                                        case 1:
                                            System.out.println("Informando a conta");
                                            break;
                                        case 2:
                                            System.out.println("Dinheiro, Cartao, ou PIX");
                                            break;
                                        case 3:
                                            returnMenu = true;
                                    }

                                }while (!returnMenu);

                                break;
                            case 3:
                                returnMenu = true;
                                break;
                        }

                    }while (!returnMenu);
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
                                reader.pesquisarArquivoCliente();
                                break;
                            case 2:
                                reader.pesquisarArquivoFunc();
                                break;
                            case 3:
                                reader.pesquisarArquivoCard();
                                break;
                            case 4:
                                returnMenu = true;
                                break;
                            }
                        }

                    }while (!returnMenu);
                    break;
                case 5:
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (op != 5);
    }

}
