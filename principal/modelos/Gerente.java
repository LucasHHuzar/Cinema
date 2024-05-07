package principal.modelos;

import principal.PrincipalTestes;
import principal.modelos.files.Reader;
import principal.modelos.files.Writer;

import java.io.IOException;
import java.util.Scanner;

public class Gerente extends Funcionario {

    Scanner scanner = new Scanner(System.in);

    private String demitir;

    public Gerente(){ }

//    public Gerente(String nome, Boolean despedir, Boolean alterarSalario) {
//        super(nome);
//        this.despedir = despedir;
//        this.alterarSalario = alterarSalario;
//    }

    public String getDespedir() { return demitir; }

    public void setDespedir(String demitir) { this.demitir = demitir; }

    public void listarFunc() throws IOException {
        Reader reader = new Reader();
        String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";
        reader.mostrarArquivo(caminhoDoArquivo);
    }

    public void  demitirFunc() throws IOException{
        //codigo para remocao do funcionario da lista
        Writer writer = new Writer();
        String arquivoCaminho = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";
        //usei esse scanner pois estava passando direto
        scanner.nextLine();
        System.out.println("Passe o Nome numIdentificação e cargo de quem deseja remover: ");
        String itemParaRemover = scanner.nextLine();
        writer.removerItemArquivo(arquivoCaminho, itemParaRemover);
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