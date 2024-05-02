package principal.modelos;

import java.util.*;

public class Funcionario {

    //Iniciando as variáveis
    protected String nome;
    protected Integer numIdentifiFuncionario;
    protected String cargo;

    //Iniciando a lista de funcionários
    public static List<Funcionario> funcionarios = new ArrayList<>();

    //Iniciei um construtor vazio, só pra deixar caso precisemos
    public Funcionario() { //Construtor vazio
    }

    public Funcionario(String nome, Integer numIdentifiFuncionario, String cargo) {
        this.nome = nome;
        this.numIdentifiFuncionario = numIdentifiFuncionario;
        this.cargo = cargo;
        funcionarios.add(this);
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }


    //Inicie essse construtor pois la no gerente pedia
    public Funcionario(String nome) {
        this.nome = nome;
    }

    //Getters e Setters das variáveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumIdentifiFuncionario() {
        return numIdentifiFuncionario;
    }

    public void setNumIdentifiFuncionario(Integer numIdentifiFuncionario) {
        this.numIdentifiFuncionario = numIdentifiFuncionario;
    }

    //Refiz a classe toString pra podermos visualizar na principal
    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", numFuncionario=" + numIdentifiFuncionario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    private void gerente(){

        String sobrenome;



    }

}
