package principal.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;

    public Cliente() { }

    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
