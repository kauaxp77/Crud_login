public class Main {
    public static void main(String[] args) {

        System.out.println(" LOG DE EXECUÇÃO DO SISTEMA\n");

        System.out.println(" TESTANDO PERFIS");
        Perfil perfilAdmin = new Perfil("Administrador", true);
        perfilAdmin.cadastrarPerfil();

        Perfil perfilVisitante = new Perfil("Visitante", true);
        perfilVisitante.cadastrarPerfil();

        perfilVisitante.alterarPerfil("Convidado", false);

        System.out.println("\n---\n");
        System.out.println(" TESTANDO USUÁRIOS");
        Usuario.cadastrarUsuario("João Silva", "joao.silva", "123456");
        Usuario.cadastrarUsuario("Maria Souza", "maria.s", "abcdef");

        Usuario.cadastrarUsuario("João Fake", "joao.silva", "999999");

        System.out.println("\n---\n");
        System.out.println(" TESTANDO LOGIN E SENHAS");
        Usuario.realizarLogin("joao.silva", "senha_errada");

        Usuario usuarioLogado = Usuario.realizarLogin("joao.silva", "123456");

        if (usuarioLogado != null) {
            // Alterar a senha (com erro)
            usuarioLogado.alterarSenha("senha_errada", "nova_senha_789");

            // Alterar a senha (com sucesso)
            usuarioLogado.alterarSenha("123456", "nova_senha_789");

            System.out.println("\n---\n");
            System.out.println(" EFETUANDO LOGIN COM A NOVA SENHA");
            Usuario.realizarLogin("joao.silva", "nova_senha_789");
        }
    }
}