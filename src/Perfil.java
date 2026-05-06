import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private Integer id;
    private String nome;
    private boolean ativo;

    private static List<Perfil> dbPerfis = new ArrayList<>();
    private static int geradorId = 1;

    public Perfil(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public void cadastrarPerfil() {
        this.id = geradorId++;
        dbPerfis.add(this);
        System.out.println(" Cadastrado: Perfil '" + this.nome + "' (ID: " + this.id + ") criado com sucesso.");
    }

    public void alterarPerfil(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
        System.out.println(" Alterado: Perfil ID " + this.id + " modificado para Nome: '" + nome + "', Ativo: " + ativo + ".");
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public boolean isAtivo() { return ativo; }
}