package principal.modelos;

public class Funcionario {

    private String nome;
    private Integer numFuncionario;

    public Funcionario(String nome, Integer numFuncionario) {
        this.nome = nome;
        this.numFuncionario = numFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(Integer numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", numFuncionario=" + numFuncionario +
                '}';
    }
}
