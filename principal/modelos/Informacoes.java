package principal.modelos;

import java.util.ArrayList;
import java.util.List;

public class Informacoes {

    public static List<Cliente> listaClientes() {
        var listaClien =  new ArrayList<Cliente>();
        listaClien.add(new Cliente("João"));
        listaClien.add(new Cliente("Maria"));
        listaClien.add(new Cliente("Ana"));

        return listaClien;
    }

    public static List<Funcionario> listaFuncionarios() {
        var listaFunc =  new ArrayList<Funcionario>();
        listaFunc.add(new Funcionario("Lucas", 1, "Gerente"));
        listaFunc.add(new Funcionario("André", 2, "Administrativo"));
        listaFunc.add(new Funcionario("Felipe", 3, "Garçom"));

        return listaFunc;
    }

}
