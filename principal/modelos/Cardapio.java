//Ideia que tive porém ainda não fiz, em criar um número para cada comida/bebida/sobremesa e quando a pessoa for fazer
//um pedido, só colocar o número da comida, e então tem que criar um verificador para puxar o número e levar ele para
//classe pedido

package principal.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {

    //Iniciei as variáveis
    private Integer tipoPrato;
    private Integer numProduto;
    private String nomePrato;
    private String bebida;
    private String sobremesa;
    private Double valor;

    //Lista do cardapio
    List<Cardapio> cardapio = new ArrayList<>();

    public Cardapio() {
        cadastroProdutos();
    }

    public Cardapio(Integer tipoPrato, Integer numProduto, String nomePrato, String bebida, String sobremesa, Double valor) {
        this.tipoPrato = tipoPrato;
        this.numProduto = numProduto;
        this.nomePrato = nomePrato;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
        this.valor = valor;
    }

    //Getters e Setters
    public Integer getTipoPrato() {
        return tipoPrato;
    }

    public void setTipoPrato(Integer tipoPrato) {
        this.tipoPrato = tipoPrato;
    }

    public Integer getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(Integer numProduto) {
        this.numProduto = numProduto;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setPrato(String prato) {
        this.nomePrato = nomePrato;
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

    private void cadastroProdutos(){

        cardapio.add(new Cardapio(1, 1, "Strogonoff de Frango", "", "", 22.00));
        cardapio.add(new Cardapio(1, 2, "Batata Frita", "", "", 8.00));
        cardapio.add(new Cardapio(1, 3, "Bife Parmegiana", "", "", 10.00));
        cardapio.add(new Cardapio(2, 4, "", "Água", "", 2.00));
        cardapio.add(new Cardapio(2, 5, "", "Coca-Cola", "", 6.00));
        cardapio.add(new Cardapio(2, 6, "", "Chocomilk", "", 5.50));
        cardapio.add(new Cardapio(3, 7, "", "", "Petit-Gateau", 20.90));
        cardapio.add(new Cardapio(3, 8, "", "", "Bolo de Pote", 10.00));
        cardapio.add(new Cardapio(3, 9, "", "", "Banana Caramelizada", 9.00));

    }


    @Override
    public String toString() {
        return "Cardapio{" +
                ", Lista de Produtos:'" + '\'' +
                ", prato='" + numProduto + nomePrato + '\'' +
                ", bebida='" + bebida + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                ", valor=" + valor +
                '}';
    }
}