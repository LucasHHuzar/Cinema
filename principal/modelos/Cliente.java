package principal.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private Integer mesa;
//    private String aniversario;

    List<Cliente> clientes = new ArrayList<>();

    public Cliente() { //Construtor vazio
    }

    public Integer getMesa() { return mesa; }

    public void setMesa(Integer mesa) { this.mesa = mesa; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

//    public String getAniversario() { return aniversario; }
//
//    public void setAniversario(String aniversario) { this.aniversario = aniversario; }

    public List<Cliente> getClientes() { return clientes; }

    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }

    public void adicionarCliente(String nome, Integer mesa){

        Cliente cliente = new Cliente();

        cliente.nome = nome;
        cliente.mesa = mesa;

        clientes.add(cliente);
    }

    public void cadastrarClientes(){

        System.out.println("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite a mesa que o cliente está: ");
        this.mesa = scanner.nextInt();
        scanner.nextLine();

    }

    public void menuClientes(){

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Ver lista de clientes");
        System.out.println("3 - Sair");
        var op = scanner.nextInt();

        switch (op){

            case 1: cadastrarClientes();
                return;

            case 2: getClientes();
                return;

        }

        scanner.close();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", nome='" + nome + '\'' +
                ", mesa=" + mesa +
                '}';
    }
}
