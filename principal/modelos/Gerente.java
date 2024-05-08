package principal.modelos;

import java.io.IOException;
import java.util.Scanner;

public class Gerente extends Funcionario {

    Scanner scanner = new Scanner(System.in);
    FileManager file = new FileManager();

    private String demitir;

    public Gerente(){ }

    public String getDespedir() { return demitir; }

    public void setDespedir(String demitir) { this.demitir = demitir; }

    //serve para chamar no menu do gerente para mostrar a lista de funcionarios
    public void listarFunc() throws IOException {

        String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";
        file.mostrarArquivo(caminhoDoArquivo);

    }

    //serve para chamar no menu do gerente para que ele possa fazer a remoção do funcionario da lista
    public void demitirFunc() throws IOException{

        String arquivoCaminho = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";
        //usei esse scanner pois estava passando direto
        scanner.nextLine();

        System.out.println("Passe o Nome ou Número de Identificação de quem deseja remover: ");
        String itemParaRemover = scanner.nextLine();

        file.removerItemArquivo(arquivoCaminho, itemParaRemover);

    }

    public void removerCliente() throws IOException{

        String caminhoDoArquivoCliente = "C:\\Restaurante\\Listas\\ListaCliente.txt";
        //usei esse scanner pois estava passando direto
        scanner.nextLine();

        System.out.println("Passe o Nome ou Id do Cliente que deseja remover: ");
        String removerCliente = scanner.nextLine();
        file.removerItemArquivo(caminhoDoArquivoCliente, removerCliente);

    }

//    public void adicionarAtributos(String nome, Integer numIdentifiFuncionario, String cargo){
//
//        Funcionario func = new Funcionario();
//
//        func.nome = nome;
//        func.numIdentifiFuncionario = numIdentifiFuncionario;
//        func.cargo = cargo;
//
//        funcionarios.add(func);
//    }

    //Criei uma classe para adicionar funcionários
//    public void addFuncionario(){
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 2; i++) {
//
//            System.out.println("Qual o nome do funcionário?");
//            this.nome = scanner.nextLine();
//
//            System.out.println("Qual o número de identificação do funcionário?");
//            this.numIdentifiFuncionario = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Qual o cargo do funcionário (Gerente, Administrativo ou Garçom)?");
//            this.cargo = scanner.nextLine();
//
//            adicionarAtributos(nome, numIdentifiFuncionario, cargo);
//
//        }

       // scanner.close();
}