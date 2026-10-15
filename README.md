# 🚀 WebAppDevSummit - Sistema de Inscrição em Eventos

O **WebAppDevSummit** é uma aplicação web desenvolvida em Java no padrão **MVC (Model-View-Controller)** para gerenciamento de inscrições de participantes em conferências e summits de tecnologia. O sistema permite o cadastro completo de inscritos, persistindo os dados em um banco de dados **MySQL** por meio do padrão **DAO (Data Access Object)**.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Servidor / Container:** Apache Tomcat
* **Tecnologia Web:** JSP (JavaServer Pages) & HTML5 / CSS3
* **Persistência & Banco de Dados:** JDBC (Java Database Connectivity) e MySQL
* **IDE de Desenvolvimento:** Apache NetBeans IDE
* **Controle de Versão:** Git & GitHub

---

## 🏗️ Arquitetura do Sistema (MVC)

A arquitetura foi projetada para garantir a separação de responsabilidades e facilita a manutenção do código:

```
[ Usuário / Navegador ]
         │
         ▼
  ┌──────────────┐
  │ inscricao.html│ ◄── (Visão / UI)
  └──────┬───────┘
         │ (HTTP POST)
         ▼
 ┌────────────────┐
 │inscricao_cad.jsp│ ◄── (Controller)
 └───────┬────────┘
         │
         ▼
 ┌────────────────┐        ┌────────────────┐
 │ Inscricao.java │ ◄────► │InscricaoDAO.java│ ◄── (Model & DAO)
 └────────────────┘        └───────┬────────┘
                                   │ (JDBC)
                                   ▼
                           ┌──────────────┐
                           │ db_devsummit │ ◄── (Banco MySQL)
                           └──────────────┘
```

---

## 📊 Modelagem do Banco de Dados (DER)

A tabela `tb_inscricao` no banco `db_devsummit` é responsável por armazenar todos os dados cadastrais necessários dos participantes:

| Campo | Tipo | Descrição |
| :--- | :--- | :--- |
| `id_inscricao` | INT (PK, Auto Increment) | Identificador único da inscrição |
| `nome` | VARCHAR(100) | Nome do participante |
| `sobrenome` | VARCHAR(100) | Sobrenome |
| `email_corporativo` | VARCHAR(150) | E-mail corporativo para contato |
| `telefone_celular` | VARCHAR(20) | Celular / WhatsApp |
| `nome_empresa` | VARCHAR(100) | Empresa onde trabalha |
| `cargo` | VARCHAR(50) | Cargo ocupado |
| `setor` | VARCHAR(50) | Área / Setor de atuação |
| `nacionalidade` | VARCHAR(50) | País de origem |
| `cidade` | VARCHAR(50) | Cidade de residência |
| `tipo_documento` | VARCHAR(20) | CPF, Passaporte ou RNE |
| `numero_documento` | VARCHAR(30) | Número do documento de identificação |
| `como_conheceu` | VARCHAR(50) | Origem da indicação/inscrição |
| `data_inscricao` | TIMESTAMP | Data e hora exata do cadastro |

---

## 📁 Estrutura de Pacotes

```text
WebAppDevSummit/
├── src/
│   └── java/
│       ├── conexao/
│       │   └── ConectaBanco.java    # Gerencia a conexão JDBC com MySQL
│       ├── dao/
│       │   └── InscricaoDAO.java    # Operações SQL (INSERT)
│       └── model/
│           └── Inscricao.java       # Entidade de domínio (JavaBeans)
├── web/
│   ├── META-INF/
│   ├── WEB-INF/
│   ├── inscricao.html               # Form de cadastro
│   └── inscricao_cad.jsp            # Processamento e controller
└── README.md
```

---

## 💻 Como Executar o Projeto

1. **Configurar o Banco de Dados:**
   * Crie o banco de dados `db_devsummit` no MySQL.
   * Crie a tabela `tb_inscricao`.

2. **Configurar a Conexão JDBC:**
   * Certifique-se de adicionar o driver `mysql-connector-j.jar` nas bibliotecas do NetBeans.
   * Ajuste usuário/senha da sua instância local na classe `ConectaBanco.java`.

3. **Executar na IDE NetBeans:**
   * Abra o projeto no NetBeans.
   * Clique com o botão direito no projeto e selecione **Run** (Executar).
   * O servidor Tomcat iniciará e abrirá a página no navegador.

---
Desenvolvido por **Danilo Carvalho** (`daniilocl`).
