package principal.modelos.Lista;

import principal.modelos.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class ListaAddFuncionarios {
    private List<Funcionario> funcionarios;

    public ListaAddFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void main(String[] args) {
        ListaAddFuncionarios listaFuncionarios = new ListaAddFuncionarios();

        // Adicionando funcionários
        listaFuncionarios.adicionarFuncionario(new Funcionario("Lucas", 1, "Garçom"));
        listaFuncionarios.adicionarFuncionario(new Funcionario("Andre", 2, "ADM"));
        listaFuncionarios.adicionarFuncionario(new Funcionario("yuri", 3, "Desempregado"));

        // Imprimindo os funcionários
        List<Funcionario> funcionarios = listaFuncionarios.getFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}


