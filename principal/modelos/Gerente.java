package principal.modelos;

public class Gerente extends Funcionario {
    private Boolean despedir;
    private Boolean alterarSalario;

    public Gerente(String nome, Boolean despedir, Boolean alterarSalario) {
        super(nome);
        this.despedir = despedir;
        this.alterarSalario = alterarSalario;
    }


    public Boolean getAlterarSalario() {
        return alterarSalario;
    }

    public void setAlterarSalario(Boolean alterarSalario) {
        this.alterarSalario = alterarSalario;
    }

    public Boolean getDespedir() {
        return despedir;
    }

    public void setDespedir(Boolean despedir) {
        this.despedir = despedir;
    }
}
