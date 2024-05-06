package principal.modelos;

import java.util.*;

public class Funcionario {

    //Iniciando as variáveis
    protected String nome;
    protected Integer numIdentifiFuncionario;
    protected String cargo;

    //Iniciei um construtor vazio, só pra deixar caso precisemos
    public Funcionario(String nome, Integer numIdentifiFuncionario, String cargo) {
        this.nome = nome;
        this.numIdentifiFuncionario = numIdentifiFuncionario;
        this.cargo = cargo;
        //adicionarFuncionario();
    }

//    public Funcionario(String nome, Integer numIdentifiFuncionario, String cargo) {
//        this.nome = nome;
//        this.numIdentifiFuncionario = numIdentifiFuncionario;
//        this.cargo = cargo;
//        funcionarios.add(this);
//    }
//    public void adicionarFuncionario() {
//        funcionarios.add(new Funcionario("Lucas", 1, "Gerente"));
//        funcionarios.add(new Funcionario("Andre", 2, "Adiministrativo"));
//        funcionarios.add(new Funcionario("Yuri", 3, "Garçom"));
//    }
//
//    public List<Funcionario> getFuncionarios() {
//        return funcionarios;
//    }

    //Inicie esse construtor vazio
    public Funcionario() {  }

    //Getters e Setters das variáveis
    public String getNome() {
        return nome;
    }

    public Integer getNumIdentifiFuncionario() {
        return numIdentifiFuncionario;
    }

    public String getCargo() { return cargo; }

    //Refiz a classe toString pra podermos visualizar na principal
    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", numFuncionario=" + numIdentifiFuncionario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

}
