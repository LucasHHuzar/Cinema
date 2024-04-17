package PrincipalTeste.Modelos;

public class Cliente {

    //Declarando variáveis do cliente 
    private String nome;
    private String idade;
    private Boolean estudante;
    private String formaPagamento;
    private Integer filmesAssistidos;

    //Construtor e Getters e Setters
    public Cliente(String nome, String idade, Boolean estudante){
        this.nome = nome;
        this.idade = idade;
        this.estudante = false;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public Boolean getEstudante() {
        return estudante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setEstudante(Boolean estudante) {
        this.estudante = estudante;
    }
    
}
