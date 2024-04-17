package PrincipalTeste.Modelos;

import java.util.Timer;

public class Sessao {

    //Declaração das variáveis para a sessão
    private Timer hora;
    private String cliente;
    private Integer sala;
    private String assento;

    //Contrutor e Getters e Setters
    public Sessao(Timer hora, String cliente, Integer sala, String assento){
        this.hora = hora;
        this.cliente = cliente;
        this.sala = sala;
        this.assento = assento;
    }

    public Timer getHora() {
        return hora;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getSala() {
        return sala;
    }

    public String getAssento() {
        return assento;
    }

    public void setHora(Timer hora) {
        this.hora = hora;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }


}
