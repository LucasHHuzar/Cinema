package principal;

import principal.modelos.Cardapio;
import principal.modelos.Funcionario;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalTestes {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //Fiz um teste pra ver se deu certo a criação do addFuncionario
//        Funcionario funcionario = new Funcionario();
//
//        funcionario.addFuncionario();
//
//        System.out.println(funcionario.getFuncionarios());

        Cardapio cardapio = new Cardapio();

        cardapio.cadastrarProduto();

        cardapio.getCardapio();

    }
}
