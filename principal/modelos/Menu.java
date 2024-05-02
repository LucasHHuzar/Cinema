package principal.modelos;

import java.util.Scanner;

public class Menu {
        //criando menu...
        //Estou criando menu dentro de outro menu
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("=================");
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
                        System.out.println("=================");
                        System.out.println("Menu CLIENTE:");
                        System.out.println("1. Cardápio");
                        System.out.println("2. Fazer Pedido");
                        System.out.println("3. Pedir a conta");
                        System.out.println("4. Voltar para o MENU");
                        menu1 = scanner.nextInt();

                        switch (menu1){
                            case 1:
                                System.out.println("CARDAPIO");
                                break;
                            case 2:
                                System.out.println("FAZENDO PEDIDO");
                                break;
                            case 3:
                                System.out.println("PEDINDO A CONTA");
                                break;
                            case 4:
                                System.out.println("...");
                                returnMenu = true;
                        }

                    }while (!returnMenu);
                    break;

                case 2:
                    do {
                        System.out.println("=================");
                        System.out.println("Menu GERENTE:");
                        System.out.println("1. teste1");
                        System.out.println("2. teste2");
                        System.out.println("3. teste3");
                        System.out.println("4. Sair");
                        menu2 = scanner.nextInt();

                        switch (menu2){
                            case 1:
                                System.out.println("teste1");
                                break;
                            case 2:
                                System.out.println("teste2");
                                break;
                            case 3:
                                System.out.println("teste3");
                                break;
                            case 4:
                                returnMenu = true;
                        }

                    }while (!returnMenu);

                    break;
                case 3:
                    do {
                        System.out.println("=================");
                        System.out.println("Menu Funcionário:");
                        System.out.println("1. Garçom");
                        System.out.println("2. Caixa");
                        System.out.println("3. Sair");
                        menu3 = scanner.nextInt();

                        switch (menu3){
                            case 1:
                                do {
                                    System.out.println("=================");
                                    System.out.println("Menu Garçom:");
                                    System.out.println("1. Cardapio");
                                    System.out.println("2. Pedido");
                                    System.out.println("3. Conta");
                                    System.out.println("4. Sair");
                                    menu4 = scanner.nextInt();

                                    switch (menu4){
                                        case 1:
                                            System.out.println("CARDAPIO");
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
                                    System.out.println("=================");
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
