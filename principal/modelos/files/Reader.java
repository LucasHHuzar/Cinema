package principal.modelos.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public Reader() {
    }

    public static void mostrarArquivo(String caminhoDoArquivo) throws IOException {
        Path filePath = Paths.get(caminhoDoArquivo);
        List<String> linhas = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        // Imprimir cada linha do arquivo
        for (String linha : linhas) {
            System.out.println(linha);
        }
    }
}
