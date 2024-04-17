package PrincipalTeste.Modelos;

public class Filmes {
    
    //Declarando variáveis para o filme
    private String nome;
    private Integer classificacao;
    private String autor;
    private String sinopse;

    //Contrutor e Getters e Setters
    public Filmes(String nome, Integer classificacao, String autor, String sinopse){
        this.nome = nome;
        this.classificacao = classificacao;
        this.autor = autor;
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }




}
