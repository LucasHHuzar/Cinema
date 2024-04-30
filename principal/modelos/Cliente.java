package principal.modelos;

import java.time.DateTimeException;

public class Cliente {

    private String nome;
    private Integer mesa;
    private DateTimeException aniversario;

    public Cliente() {
        //Construtor vazio
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DateTimeException getAniversario() {
        return aniversario;
    }

    public void setAniversario(DateTimeException aniversario) {
        this.aniversario = aniversario;
    }

    public void cadastrarCliente(){

    }

}
