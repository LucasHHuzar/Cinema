package principal.modelos;

import java.util.*;

public class Funcionario {

    //Iniciando as variáveis
    protected String nome;
    protected Integer numIdentifiFuncionario;
    protected String cargo;

    //Construtor
    public Funcionario(String nome, Integer numIdentifiFuncionario, String cargo) {
        this.nome = nome;
        this.numIdentifiFuncionario = numIdentifiFuncionario;
        this.cargo = cargo;
    }

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

}
