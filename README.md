# 🔐 Sistema de Autenticação e Gestão de Perfis

Este é um projeto desenvolvido em **Java** que simula um sistema de autenticação de usuários e gerenciamento de perfis. O objetivo principal é demonstrar a aplicação de conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como classes, encapsulamento, modificadores de acesso e métodos estáticos, operando com armazenamento de dados em memória.

## 🚀 Funcionalidades

O sistema implementa operações de CRUD (Create, Read, Update, Delete) em memória e lida com a lógica de segurança de acesso básico:

**Gestão de Perfis:**
- `cadastrarPerfil()`: Criação de novos níveis de acesso (ex: Administrador, Visitante).
- `alterarPerfil()`: Atualização das propriedades do perfil (nome e status de ativação).

**Gestão de Usuários:**
- `cadastrarUsuario()`: Registro de usuários com validação para impedir logins duplicados.
- `realizarLogin()`: Sistema de autenticação que verifica credenciais e registra a data/hora exata do último acesso.
- `alterarSenha()`: Atualização segura de credenciais, exigindo a confirmação da senha antiga.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Orientação a Objetos (POO)
- **Bibliotecas:** `java.util.ArrayList`, `java.time.LocalDateTime` (Data e hora modernas do Java)

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Java Development Kit (JDK)** instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)
Abra o projeto na sua IDE de preferência (Eclipse, IntelliJ IDEA, VS Code).

Execute a classe Main.java para visualizar o log do sistema no console.

Aviso de Encoding: Para garantir que a formatação e os ícones do log de execução sejam exibidos corretamente, certifique-se de que o terminal da sua IDE esteja configurado para o padrão UTF-8.

🏗️ Estrutura do Código
O projeto foi construído baseado em um diagrama de classes e contém as seguintes entidades:

Usuario: Responsável por armazenar as credenciais, dados pessoais e a lógica de login e troca de senhas.

Perfil: Responsável por definir os níveis de acesso da aplicação e seus estados (ativo/inativo).

Main: Classe principal responsável por instanciar os objetos e testar o fluxo de funcionamento (simulação de uso real).

👨‍💻 Autor
Wendson Kauã
*Desenvolvedor Back-end | Estudante de AnáliseAqui está um README.md completo e estruturado, pronto para você copiar e colar no seu repositório do GitHub. Ele explica o projeto, lista as funcionalidades e já inclui uma seção de autor com os seus dados.

Markdown
# 🔐 Sistema de Autenticação e Gestão de Perfis

Este é um projeto desenvolvido em **Java** que simula um sistema de autenticação de usuários e gerenciamento de perfis. O objetivo principal é demonstrar a aplicação de conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como classes, encapsulamento, modificadores de acesso e métodos estáticos, operando com armazenamento de dados em memória.

## 🚀 Funcionalidades

O sistema implementa operações de CRUD (Create, Read, Update, Delete) em memória e lida com a lógica de segurança de acesso básico:

**Gestão de Perfis:**
- `cadastrarPerfil()`: Criação de novos níveis de acesso (ex: Administrador, Visitante).
- `alterarPerfil()`: Atualização das propriedades do perfil (nome e status de ativação).

**Gestão de Usuários:**
- `cadastrarUsuario()`: Registro de usuários com validação para impedir logins duplicados.
- `realizarLogin()`: Sistema de autenticação que verifica credenciais e registra a data/hora exata do último acesso.
- `alterarSenha()`: Atualização segura de credenciais, exigindo a confirmação da senha antiga.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Orientação a Objetos (POO)
- **Bibliotecas:** `java.util.ArrayList`, `java.time.LocalDateTime` (Data e hora modernas do Java)

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Java Development Kit (JDK)** instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
Abra o projeto na sua IDE de preferência (Eclipse, IntelliJ IDEA, VS Code).

Execute a classe Main.java para visualizar o log do sistema no console.

Aviso de Encoding: Para garantir que a formatação e os ícones do log de execução sejam exibidos corretamente, certifique-se de que o terminal da sua IDE esteja configurado para o padrão UTF-8.

🏗️ Estrutura do Código
O projeto foi construído baseado em um diagrama de classes e contém as seguintes entidades:

Usuario: Responsável por armazenar as credenciais, dados pessoais e a lógica de login e troca de senhas.

Perfil: Responsável por definir os níveis de acesso da aplicação e seus estados (ativo/inativo).

Main: Classe principal responsável por instanciar os objetos e testar o fluxo de funcionamento (simulação de uso real).

👨‍💻 Autor
Wendson Kauã
Desenvolvedor Back-end | Estudante de Análise e Desenvolvimento de Sistemas (ADS)
