package principal.modelos;

import java.util.Scanner;

public class Gerente extends Funcionario {

    private Boolean despedir;
    private Boolean alterarSalario;
    protected String cargo;

    public Gerente(){ }

    public Gerente(String nome, Boolean despedir, Boolean alterarSalario) {
        super(nome);
        this.despedir = despedir;
        this.alterarSalario = alterarSalario;
    }

    public Boolean getAlterarSalario() { return alterarSalario; }

    public void setAlterarSalario(Boolean alterarSalario) { this.alterarSalario = alterarSalario; }

    public Boolean getDespedir() { return despedir; }

    public void setDespedir(Boolean despedir) { this.despedir = despedir; }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void adicionarAtributos(String nome, Integer numIdentifiFuncionario, String cargo){
        func.nome = nome;
        func.numIdentifiFuncionario = numIdentifiFuncionario;
        this.cargo = cargo;
        funcionarios.add(func);
    }

    //Criei uma classe para adicionar funcionários
    public void addFuncionario(){

        Scanner scanner = new Scanner(System.in);

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

}
