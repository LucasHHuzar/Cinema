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

        Cardapio cardapio = new Cardapio();

        int op;

        do {
            System.out.println("==============================");
            System.out.println("Menu:");
            System.out.println("1. Cliente");
            System.out.println("2. Gerente");
            System.out.println("3. Funcionario");
            System.out.println("4. Sair");
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
                        System.out.println("2. Fazer Pedido");//Tirar pedido e adicionar no menu do garçom
                        System.out.println("3. Pedir a conta");//Tirar conta e adicionar no menu do garçom
                        System.out.println("4. Mostrar Clientes");
                        System.out.println("5. Voltar para o MENU");
                        menu1 = scanner.nextInt();

                        switch (menu1){
                            case 1:
                                Reader reader = new Reader();
                                String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
                                reader.mostrarArquivo(caminhoDoArquivo);

                                break;
                            case 2:
                                //Pedido.addPedidos;
                                break;
                            case 3:
                                System.out.println("PEDINDO A CONTA");
                                break;
                            case 4:
                                Reader reader1 = new Reader();
                                String caminhoDoArquivoClientes = "C:\\Restaurante\\Listas\\ListaCliente.txt";
                                reader1.mostrarArquivo(caminhoDoArquivoClientes);
                                break;
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
                        System.out.println("3. Mostrar Clientes");
                        System.out.println("4. !Tirar Clientes!");
                        System.out.println("5. Mostrar CARDAPIO");
                        System.out.println("6. !Tirar algo do Cardapio!");
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
                                Reader reader1 = new Reader();
                                String caminhoDoArquivoClientes = "C:\\Restaurante\\Listas\\ListaCliente.txt";
                                reader1.mostrarArquivo(caminhoDoArquivoClientes);
                                break;
                            case 4:
                                Writer writer1 = new Writer();
                                String caminhoDoArquivoCliente = "C:\\Restaurante\\Listas\\ListaCliente.txt";
                                //usei esse scanner pois estava passando direto
                                scanner.nextLine();
                                System.out.println("Passe o Nome e Id do cliente que deseja remover: ");
                                String removerCliente = scanner.nextLine();
                                writer1.removerItemArquivo(caminhoDoArquivoCliente, removerCliente);
                                break;
                            case 5:
                                Reader reader2 = new Reader();
                                String caminhoDoArquivoCard = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
                                reader2.mostrarArquivo(caminhoDoArquivoCard);
                                break;

                            case 6:
                                //codigo para remocao de qualquer coisa do cardapio
                                Writer writer2 = new Writer();
                                String arquivoCaminhoCard = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
                                //usei esse scanner pois estava passando direto
                                scanner.nextLine();
                                System.out.println("Passe o que deseja retirar, exatemente como esta no Cardapio");
                                String itemParaRemover1 = scanner.nextLine();
                                writer2.removerItemArquivo(arquivoCaminhoCard, itemParaRemover1);
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
                                            Reader reader = new Reader();
                                            String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
                                            reader.mostrarArquivo(caminhoDoArquivo);
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
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (op != 4);
    }

}
