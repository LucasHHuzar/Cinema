package principal.modelos;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    Informacoes info = new Informacoes();

    public static void adicionarClientes() throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o ID do cliente:");
        String id = scanner.nextLine();

        scanner.close();


        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaCliente.txt";
        FileWriter fileWriter = new FileWriter(caminhoArquivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Lendo todos os clientes atuais
        List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);

        // Adicionando o novo cliente à lista
        linhas.add(nome + "," + id);

        // Ordenando a lista
        Collections.sort(linhas);

        // Escrevendo a lista ordenada de volta no arquivo
        Files.write(Paths.get(caminhoArquivo), linhas, StandardCharsets.UTF_8, StandardOpenOption.WRITE);

        printWriter.close();
        fileWriter.close();
    }

    public static void adicionarFunc() throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Funcionario:");
        String nomeFunc = scanner.nextLine();
        System.out.println("Digite o numIdentificador:");
        String numId = scanner.nextLine();
        System.out.println("Digite o cargo:");
        String cargo = scanner.nextLine();

        scanner.close();

        String caminhoArquivo = "C:\\Restaurante\\Listas\\ListaFuncionarios.txt";
        FileWriter fileWriter = new FileWriter(caminhoArquivo, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Lendo todos os clientes atuais
        List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);

        // Adicionando o novo cliente à lista
        linhas.add(nomeFunc+"," + numId + "," + cargo);;

        // Ordenando a lista
        Collections.sort(linhas);

        // Escrevendo a lista ordenada de volta no arquivo    StandardOpenOption.WRITE esta indicando que deseja abrir o arquivo
        Files.write(Paths.get(caminhoArquivo), linhas, StandardCharsets.UTF_8, StandardOpenOption.WRITE);


        printWriter.close();
        fileWriter.close();
    }

    public static void mostrarArquivo(String caminhoDoArquivo) throws IOException {

        Path filePath = Paths.get(caminhoDoArquivo);
        List<String> linhas = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        // Imprimir cada linha do arquivo
        for (String linha : linhas) {
            System.out.println(linha);
        }

    }

    public void pesquisarArquivoCliente() throws IOException {
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

    public void pesquisarArquivoFunc() throws IOException {
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

    public void pesquisarArquivoCard() throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Solicita o termo de pesquisa ao usuário
        System.out.print("Digite o que você deseja pesquisar: ");
        String pesquisa = scanner.nextLine();

        scanner.close(); //fechando o scanner aqui pois la em baixo estava dando erro.

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

    //criando diretorio e arquivo
    public void criarDiretorioEArquivo() throws IOException {
        String diretorioCARD = "C:\\Restaurante\\Listas";
        String ArquivoCard = "ListaCardapio.txt";

        File diretorioCard = criarDiretorio(diretorioCARD);
        File arquivoCard = criarArquivo(diretorioCard, ArquivoCard);


        String diretorioFUNC = "C:\\Restaurante\\Listas";
        String ArquivoFunc = "ListaFuncionarios.txt";

        File diretorioFunc = criarDiretorio(diretorioFUNC);
        File arquivoFunc = criarArquivo(diretorioFunc, ArquivoFunc);


        String diretorioCLIENTE = "C:\\Restaurante\\Listas";
        String Arquivo = "ListaCliente.txt";

        File diretorioClient = criarDiretorio(diretorioCLIENTE);
        File arquivo = criarArquivo(diretorioClient, Arquivo);

    }

    //criando diretorio
    public File criarDiretorio(String diretorioCARD) {
        File diretorio = new File(diretorioCARD);
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }
        return diretorio;
    }

    //criar arquivo
    public File criarArquivo(File diretorio, String nomeArquivo) throws IOException {
        File arquivo = new File(diretorio, nomeArquivo);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        return arquivo;
    }

    public void gravarDadosCard(File file, List<Cardapio> cardapios) throws IOException {

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Cardapio cardapio : cardapios) {
            printWriter.println(cardapio.getTipoPrato() + "," + cardapio.getNumProduto() + "," + cardapio.getNomePrato() + "," +
                    cardapio.getBebida() + "," + cardapio.getSobremesa() + "," + cardapio.getValor());
        }

        printWriter.close();
        fileWriter.close();
    }

    public void gravarDadosFunc(File file, List<Funcionario> funcionarios) throws IOException {

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Funcionario funcionario : funcionarios) {
            printWriter.println(funcionario.getNome() + "," + funcionario.getNumIdentifiFuncionario() + "," + funcionario.getCargo());
        }
        printWriter.close();
        fileWriter.close();

    }

    public void gravarDadosCliente(File file, List<Cliente> clientes) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Cliente cliente : clientes) {
            printWriter.println(cliente.getNome() + "," + cliente.getId());
        }
        printWriter.close();
        fileWriter.close();
    }

    // Excluir um item específico de um arquivo de texto
    public void removerItemArquivo(String arquivoCaminho, String itemParaRemover) throws IOException {
        System.out.println("Item a ser removido: " + itemParaRemover);

        Path filePath = Paths.get(arquivoCaminho);
        //StandardCharsets.UTF_8 em um código Java, significa que o programa está
        // usando esse "dicionário" de caracteres UTF-8 para entender e trabalhar com textos e informações.
        List<String> linhas = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        // Imprimir as linhas antes de remover o item
        System.out.println("Linhas antes da remoção:");
        for (String linha : linhas) {
            System.out.println(linha);
        }

        linhas.removeIf(line -> line.trim().equals(itemParaRemover));

        // Imprimir as linhas depois de remover o item
        System.out.println("==========================");
        System.out.println("Linhas depois da remoção:");
        for (String linha : linhas) {
            System.out.println(linha);
        }

        Files.write(filePath, linhas, StandardCharsets.UTF_8);
        System.out.println("Item removido com sucesso!");
    }

}