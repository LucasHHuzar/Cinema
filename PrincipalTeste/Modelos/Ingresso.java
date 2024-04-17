package PrincipalTeste.Modelos;

public class Ingresso {

    //Declarando variáveis do ingresso
    private Integer numero;
    private String cliente;
    private String filme;
    private String sessao;

    //Construtor e Getters e Setters
    public Ingresso(Integer numero, String cliente, String filme, String sessao){
        this.numero = numero;
        this.cliente = cliente;
        this.filme = filme;
        this.sessao = sessao;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFilme() {
        return filme;
    }

    public String getSessao() {
        return sessao;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }
    
}
