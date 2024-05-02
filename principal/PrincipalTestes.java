package principal;

import principal.modelos.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrincipalTestes {
    public static void main(String[] args) throws IOException {

        //Testando menu
//        Menu mostrar = new Menu();
//
//        mostrar.menu();

//        Cardapio cardapio = new Cardapio();
//        List<Cardapio> cardapios = cardapio.getCardapio();
//
//        for (Cardapio card : cardapios) {
//            System.out.println(card);
//        }

        Funcionario funcionario = new Funcionario();
        List<Funcionario> funcionarios = funcionario.getFuncionarios();

        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }

//
//        Gerente gerente = new Gerente();
//        Funcionario funcionario = new Funcionario();
//
//        new Funcionario("Lucas", 1, "Garçom");
//        new Funcionario("André", 2, "Admin");
//
//        List<Funcionario> funcionarios = Funcionario.getFuncionarios();
//
//        // Imprime a lista

        // Adiciona elementos à lista

//        System.out.println(funcionario.toString());

        //Fiz um teste pra ver se deu certo a criação do addFuncionario

//        gerente.addFuncionario();


//        Cliente cliente = new Cliente();
//
//        cliente.menuClientes();
//
//        System.out.println(cliente.toString());

        /*

        Scanner scanner = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();

        cardapio.cadastrarProduto();

        cardapio.getCardapio();


*/

    }
}
