//Ideia que tive porém ainda não fiz, em criar um número para cada comida/bebida/sobremesa e quando a pessoa for fazer
//um pedido, só colocar o número da comida, e então tem que criar um verificador para puxar o número e levar ele para
//classe pedido

package principal.modelos;

import principal.modelos.files.Reader;
import principal.modelos.files.Writer;

import java.io.IOException;
import java.util.*;

public class Cardapio {
    Writer writer = new Writer();
    //Iniciei as variáveis
    private Integer tipoPrato;
    private Integer numProduto;
    private String nomePrato;
    private String bebida;
    private String sobremesa;
    private Double valor;

    public Cardapio() { }

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

    public void listarCardapio() throws IOException {
        Reader reader = new Reader();
        String caminhoDoArquivoCard = "C:\\Restaurante\\Listas\\ListaCardapio.txt";
        reader.mostrarArquivo(caminhoDoArquivoCard);
    }

}