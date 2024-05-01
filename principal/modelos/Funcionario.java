package principal.modelos;

import java.util.*;

public class Funcionario {

    //Iniciando as variáveis
    private String nome;
    private Integer numIdentifiFuncionario;
    private String cargo;

    //Iniciando a lista de funcionários
    List<Funcionario> funcionarios = new ArrayList<>();

    //Iniciei um construtor vazio, só pra deixar caso precisemos
    public Funcionario() {
        //Construtor vazio
    }

    //Inicie essse construtor pois la no gerente pedia
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void adicionarAtributos(String nome, Integer numIdentifiFuncionario, String cargo){
        Funcionario func = new Funcionario();
        func.nome = nome;
        func.numIdentifiFuncionario = numIdentifiFuncionario;
        func.cargo = cargo;
        funcionarios.add(func);
    }

    //Getters e Setters das variáveis
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

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

    //Criei uma classe para adicionar funcionários
    public void addFuncionario(){

        Scanner scanner = new Scanner(System.in);
        Funcionario func = new Funcionario();

        for (int i = 0; i < 2; i++) {

            System.out.println("Qual o nome do funcionário?");
            this.nome = scanner.nextLine();

            System.out.println("Qual o número de identificação do funcionário?");
            this.numIdentifiFuncionario = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Qual o cargo do funcionário (Gerente, Administrativo ou Garçom)?");
            this.cargo = scanner.nextLine();

            adicionarAtributos(nome, numIdentifiFuncionario, cargo);

        }

        scanner.close();
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

}
