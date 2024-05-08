package principal.modelos;

import java.io.IOException;

public class Cliente {

    FileManager file = new FileManager();

    private String nome;
    private Integer id;

    public Cliente() { }

    public Cliente(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public void listarClientes() throws IOException {

        String caminhoDoArquivo = "C:\\Restaurante\\Listas\\ListaCliente.txt";
        file.mostrarArquivo(caminhoDoArquivo);

    }


}
