package principal;

import principal.modelos.*;
import principal.modelos.files.Writer;

import java.io.File;
import java.io.IOException;

import java.util.List;

public class PrincipalTestes {
    public static void main(String[] args) throws IOException {

        //Testando menu
        Menu mostrar = new Menu();

        mostrar.menu();

        //Criação do diretorio e arquivos txt
//        Writer writer = new Writer();
//
//        writer.criarDiretorioEArquivo();
//
//        List<Cardapio> cardapios = Informacoes.cardapios();
//        List<Funcionario> funcionarios = Informacoes.listaFuncionarios();
//        List<Cliente> cliente = Informacoes.listaClientes();
//
//        File arquivo = new File("C:\\Restaurante\\Listas\\ListaCardapio.txt");
//        writer.gravarDadosCard(arquivo, cardapios);
//
//        File arquivoFunc = new File("C:\\Restaurante\\Listas\\ListaFuncionarios.txt");
//        writer.gravarDadosFunc(arquivoFunc, funcionarios);
//
//        File arquivoCliente = new File("C:\\Restaurante\\Listas\\ListaCliente.txt");
//        writer.gravarDadosCliente(arquivoCliente, cliente);
    }
}
