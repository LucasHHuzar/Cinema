package principal.modelos;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static List<Cliente> listaClientes() {
        var lista =  new ArrayList<Cliente>();
        lista.add(new Cliente("João"));
        lista.add(new Cliente("Maria"));

        return lista;
    }

    public static List<?> listaFuncionarios() {
        var lista =  new ArrayList<Cliente>();
        lista.add(new Cliente("João"));
        lista.add(new Cliente("Maria"));

        return lista;
    }

}
