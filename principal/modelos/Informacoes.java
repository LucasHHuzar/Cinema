package principal.modelos;

import javax.swing.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Informacoes {


    public static List<Cliente> listaClientes() {

        var listaClien = new ArrayList<Cliente>();

        listaClien.add(new Cliente("João", 1));
        listaClien.add(new Cliente("Maria", 2));
        listaClien.add(new Cliente("Ana", 3));

        return listaClien;
    }

    public static List<Funcionario> listaFuncionarios() {

        var listaFunc = new ArrayList<Funcionario>();

        listaFunc.add(new Funcionario("Lucas", 1, "Gerente"));
        listaFunc.add(new Funcionario("André", 2, "Administrativo"));
        listaFunc.add(new Funcionario("Felipe", 3, "Garçom"));

        return listaFunc;
    }

    public static List<Cardapio> cardapios(){

        var cardapio = new ArrayList<Cardapio>();

        cardapio.add(new Cardapio(1, 1, "Strogonoff de Frango", "", "", 22.00));
        cardapio.add(new Cardapio(1, 2, "Batata Frita", "", "", 8.00));
        cardapio.add(new Cardapio(1, 3, "Bife Parmegiana", "", "", 10.00));
        cardapio.add(new Cardapio(2, 4, "", "Água", "", 2.00));
        cardapio.add(new Cardapio(2, 5, "", "Coca-Cola", "", 6.00));
        cardapio.add(new Cardapio(2, 6, "", "Chocomilk", "", 5.50));
        cardapio.add(new Cardapio(3, 7, "", "", "Petit-Gateau", 20.90));
        cardapio.add(new Cardapio(3, 8, "", "", "Bolo de Pote", 10.00));
        cardapio.add(new Cardapio(3, 9, "", "", "Banana Caramelizada", 9.00));

        return cardapio;
    }


}
