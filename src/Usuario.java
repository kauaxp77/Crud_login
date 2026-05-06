import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private LocalDateTime ultimo_acesso;

    private static List<Usuario> dbUsuarios = new ArrayList<>();
    private static int geradorId = 1;

    private Usuario(Integer id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public static Usuario cadastrarUsuario(String nome, String login, String senha) {
        for (Usuario u : dbUsuarios) {
            if (u.login.equals(login)) {
                System.out.println(" Erro: O login '" + login + "' já está em uso.");
                return null;
            }
        }

        Usuario novoUsuario = new Usuario(geradorId++, nome, login, senha);
        dbUsuarios.add(novoUsuario);
        System.out.println("Cadastrado: Usuário '" + nome + "' (Login: " + login + ") criado com sucesso.");
        return novoUsuario;
    }

    public static Usuario realizarLogin(String login, String senha) {
        for (Usuario u : dbUsuarios) {
            if (u.login.equals(login) && u.senha.equals(senha)) {
                u.ultimo_acesso = LocalDateTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");
                System.out.println("Acesso Liberado: Login realizado com sucesso! Bem-vindo, " + u.nome + ".");
                System.out.println(" *Último acesso: " + u.ultimo_acesso.format(formatter) + "*");

                return u;
            }
        }
        System.out.println("Falha de Autenticação: Login ou senha incorretos para o usuário '" + login + "'.");
        return null;
    }

    public void alterarSenha(String antiga, String nova) {
        if (this.senha.equals(antiga)) {
            this.senha = nova;
            System.out.println(" Senha Atualizada: Senha do usuário '" + this.login + "' alterada com sucesso!");
        } else {
            System.out.println(" Erro de Segurança: A senha antiga informada está incorreta.");
        }
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getLogin() { return login; }
    public LocalDateTime getUltimoAcesso() { return ultimo_acesso; }
}