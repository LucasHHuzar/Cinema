//Ideia que tive porém ainda não fiz, em criar um número para cada comida/bebida/sobremesa e quando a pessoa for fazer
//um pedido, só colocar o número da comida, e então tem que criar um verificador para puxar o número e levar ele para
//classe pedido

package principal.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {

    Scanner scanner = new Scanner(System.in);

    //Iniciei as variáveis
    private Integer numProduto;
    private String prato;
    private String ingredientes;
    private String bebida;
    private String sobremesa;
    private Double valor;

    //Lista do cardapio
    List<Cardapio> cardapio = new ArrayList<>();

    public void adicionarProdutos(Integer numProduto, String prato, String ingredientes, String bebida,
                                  String sobremesa, Double valor){

        Cardapio produtos = new Cardapio();

        produtos.numProduto = numProduto;
        produtos.prato = prato;
        produtos.ingredientes = ingredientes;
        produtos.bebida = bebida;
        produtos.sobremesa = sobremesa;
        produtos.valor = valor;

        cardapio.add(produtos);
    }

    //Getters e Setters
    public Integer getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(Integer numProduto) {
        this.numProduto = numProduto;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Cardapio> getCardapio() {
        return cardapio;
    }

    public void setCardapio(List<Cardapio> cardapio) {
        this.cardapio = cardapio;
    }

    private void cadastroPrato(){

        System.out.println("Qual o número do prato?");
        this.numProduto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o nome do prato?");
        this.prato = scanner.nextLine();

        System.out.println("Qual os ingredientes?");
        this.ingredientes = scanner.nextLine();

        System.out.println("Qual o valor do prato?");
        this.valor = scanner.nextDouble();
        scanner.nextLine();

    }

    private void cadastroBebida(){

        System.out.println("Qual o número da bebida?");
        this.numProduto = scanner.nextInt();

        System.out.println("Qual o nome da bebida?");
        this.bebida = scanner.nextLine();

        System.out.println("Qual os ingredientes?");
        this.ingredientes = scanner.nextLine();

        System.out.println("Qual o valor da bebida?");
        this.valor = scanner.nextDouble();

    }

    private void cadastroSobremesa(){

        System.out.println("Qual o número da sobremesa?");
        this.numProduto = scanner.nextInt();

        System.out.println("Qual o nome da sobremesa?");
        this.sobremesa = scanner.nextLine();

        System.out.println("Qual os ingredientes?");
        this.ingredientes = scanner.nextLine();

        System.out.println("Qual o valor da sobremesa?");
        this.valor = scanner.nextDouble();

    }

    //Fiz a classe para cadastro de pratos, bebidas e tal
    public void cadastrarProduto(){

        System.out.println("--------------------------------------------");
        System.out.println("----------Cadastrando novo produto----------");
        System.out.println("-----Vai ser prato, bebida ou sobremesa?-----");
        var op = scanner.nextLine();

        switch (op){

            case "prato": cadastroPrato();
                return;

            case "bebida": cadastroBebida();
                return;

            case "sobremesa": cadastroSobremesa();
                return;
        }

        scanner.close();

    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "scanner=" + scanner +
                ", prato='" + prato + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", bebida='" + bebida + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                ", valor=" + valor +
                '}';
    }
}