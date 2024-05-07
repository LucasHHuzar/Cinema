package principal.modelos.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static void mostrarArquivo(String caminhoDoArquivo) throws IOException {
        Path filePath = Paths.get(caminhoDoArquivo);
        List<String> linhas = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        // Imprimir cada linha do arquivo
        for (String linha : linhas) {
            System.out.println(linha);
        }

    }

    public void pesquisarArquivoCliente() throws IOException{
        Scanner scanner = new Scanner(System.in);

        // Solicita o termo de pesquisa ao usuário
        System.out.print("Digite o que você deseja pesquisar: ");
        String pesquisa = scanner.nextLine();

        scanner.close(); //fechando o scanner aqui pois la em baixo estava dando erro

        // Caminho completo do arquivo
        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaCliente.txt";

        // Abrir o arquivo e pesquisar
        File arquivo = new File(caminhoArquivo);
        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        int linhaNum = 0;

        while (bufferedReader.ready()) {
            linha = bufferedReader.readLine();
            linhaNum++;
            if (linha.contains(pesquisa)) {
                System.out.println("Encontrado na linha " + linhaNum + ": " + linha);
            }
        }

        bufferedReader.close();
        fileReader.close();
        }

    public void pesquisarArquivoFunc() throws IOException{
        Scanner scanner = new Scanner(System.in);

        // Solicita o termo de pesquisa ao usuário
        System.out.print("Digite o que você deseja pesquisar: ");
        String pesquisa = scanner.nextLine();

        scanner.close(); //fechando o scanner aqui pois la em baixo estava dando erro

        // Caminho completo do arquivo
        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";

        // Abrir o arquivo e pesquisar
        File arquivo = new File(caminhoArquivo);
        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        int linhaNum = 0;

        while (bufferedReader.ready()) {
            linha = bufferedReader.readLine();
            linhaNum++;
            if (linha.contains(pesquisa)) {
                System.out.println("Encontrado na linha " + linhaNum + ": " + linha);
            }
        }

        bufferedReader.close();
        fileReader.close();
    }

    public void pesquisarArquivoCard() throws IOException{
        Scanner scanner = new Scanner(System.in);

        // Solicita o termo de pesquisa ao usuário
        System.out.print("Digite o que você deseja pesquisar: ");
        String pesquisa = scanner.nextLine();

        scanner.close(); //fechando o scanner aqui pois la em baixo estava dando erro

        // Caminho completo do arquivo
        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaCardapio.txt";

        // Abrir o arquivo e pesquisar
        File arquivo = new File(caminhoArquivo);
        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        int linhaNumero = 0;

        while (bufferedReader.ready()) {
            linha = bufferedReader.readLine();
            linhaNumero++;
            if (linha.contains(pesquisa)) {
                System.out.println("Encontrado na linha " + linhaNumero + ": " + linha);
            }
        }

        bufferedReader.close();
        fileReader.close();
    }


    }

