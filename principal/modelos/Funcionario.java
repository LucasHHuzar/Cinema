package principal.modelos;

import java.util.*;

public class Funcionario {

    //Iniciando as variáveis
    protected String nome;
    protected Integer numIdentifiFuncionario;

    Gerente gerente = new Gerente();

    Funcionario func = new Funcionario();

    //Iniciando a lista de funcionários
    List<Funcionario> funcionarios = new ArrayList<>();

    //Iniciei um construtor vazio, só pra deixar caso precisemos
    public Funcionario() { //Construtor vazio
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    //Refiz a classe toString pra podermos visualizar na principal
    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", numFuncionario=" + numIdentifiFuncionario +
                ", cargo='" + gerente.cargo + '\'' +
                '}';
    }

}
