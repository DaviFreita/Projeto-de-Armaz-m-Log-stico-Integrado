# Sistema de Gerenciamento de Armazenamento Logístico

## 📖 Sobre o Projeto

Este projeto corresponde ao backend do Sistema de Gerenciamento de Armazenamento Logístico Móvel, desenvolvido como atividade da disciplina de Engenharia de Software da Universidade Federal Rural do Semi-Árido (UFERSA).

---

## 🎯 Objetivo do Sistema

O Sistema de Gerenciamento de Armazenamento Logístico Móvel tem como objetivo auxiliar pequenos e médios armazéns no controle e gerenciamento de estoque por meio de uma solução digital integrada. O sistema busca substituir processos manuais baseados em papel, proporcionando maior agilidade, segurança e confiabilidade no armazenamento e consulta das informações.

Além do controle de produtos, a aplicação permite o gerenciamento de clientes, vendas e movimentações de estoque, contribuindo para uma administração mais eficiente das operações logísticas e para a tomada de decisões baseada em dados atualizados em tempo real.

---

## ⚠️ Descrição do Problema

Muitos pequenos e médios armazéns ainda realizam o controle de estoque de forma manual, utilizando anotações em papel ou planilhas pouco estruturadas. Esse processo pode gerar diversos problemas operacionais, como perda de registros, inconsistências entre o estoque físico e o estoque registrado, demora na conferência de mercadorias e dificuldades no acompanhamento das entradas e saídas de produtos.

Além disso, a dependência de processos manuais aumenta a probabilidade de erros humanos, comprometendo a confiabilidade das informações e dificultando a gestão eficiente do negócio. Diante desse cenário, surgiu a necessidade de desenvolver uma solução informatizada capaz de centralizar, automatizar e organizar as informações do armazém, reduzindo falhas operacionais e melhorando o controle logístico.

---

## 🚀 Funcionalidades

### 📦 Gerenciamento de Produtos
- Cadastro de produtos;
- Consulta de produtos cadastrados;
- Atualização de informações dos produtos;
- Exclusão de produtos;
- Controle de estoque disponível.

### 🔍 Busca e Filtragem
- Busca rápida por nome de produto;
- Filtragem por categorias:
  - Bebidas
  - Massas
  - Rações
  - Refrigerantes
  - Grãos

### 🛒 Gerenciamento de Vendas
- Registro de vendas;
- Associação de vendas a clientes;
- Atualização automática do estoque após cada venda;
- Cálculo automático do valor total da compra.

### 👥 Gerenciamento de Clientes
- Cadastro de clientes;
- Consulta de clientes cadastrados;
- Associação de clientes às vendas realizadas.

### 📊 Relatórios
- Consulta de dados operacionais;
- Acompanhamento do faturamento;
- Visualização de informações para apoio à tomada de decisões.

### ⚠️ Controle de Estoque
- Monitoramento de quantidade disponível;
- Alertas para estoque crítico;
- Prevenção de estoque negativo;
- Atualização automática das quantidades.

---

## ⚙️ Como Funciona

O sistema atua como backend da aplicação, sendo responsável pelo processamento e gerenciamento das informações.

As operações realizadas pelos usuários através do aplicativo móvel são enviadas ao backend, que processa os dados, realiza as validações necessárias e mantém as informações armazenadas de forma consistente.

Sempre que ocorre uma entrada ou saída de mercadorias, o estoque é atualizado automaticamente, garantindo que os dados apresentados ao usuário reflitam a situação real do armazém.

---

## 🛠 Tecnologias Utilizadas

### 💻 Linguagens
- Java 21
- Dart
- SQL

### 🚀 Frameworks e Ferramentas
- Flutter
- Supabase

### 📦 Gerenciamento de Estado
- Provider

### 🗄️ Banco de Dados
- PostgreSQL (via Supabase Database)

### ☁️ Backend as a Service (BaaS)
- Supabase Auth
- Supabase Database
- Supabase Storage
- Supabase Realtime

### 🏗️ Arquitetura
- MVVM (Model-View-ViewModel)

### 🔄 Controle de Versão
- Git
- GitHub

### 🔐 Autenticação e Segurança
- Login e Cadastro com Supabase Auth
- Autenticação Biométrica (`local_auth`)
- Controle de Sessão
- Persistência de Autenticação

### 📱 Desenvolvimento Mobile
- Android
- Interface Responsiva
- Navegação entre Telas

### ✅ Formulários e Validações
- Validação de CPF
- Validação de CNPJ
- Validação de CEP
- Validação de E-mail
- Máscaras de Entrada

### 📚 Principais Bibliotecas Flutter
- `provider`
- `supabase_flutter`
- `local_auth`
- `mask_text_input_formatter`
- `intl`

---

## 📂 Estrutura do Projeto

O backend foi desenvolvido utilizando Java e Spring Boot, seguindo uma arquitetura em camadas para promover organização, manutenção e escalabilidade do sistema.

```text
ProjetoDeArmazenamentoLogistico/
├── src/
│   ├── main/
│   │   ├── java/com/group/ArmazemApplication/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── ArmazemApplication.java
│   │   └── resources/
│   └── test/
├── .mvn/
│   └── wrapper/
├── .idea/
├── out/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```
---

## ▶️ Instruções de Execução

### Pré-requisitos

- Java 21 ou superior
- Maven
- Git

### Clonar o Repositório

```bash
git clone https://github.com/DaviFreita/ProjetodeArmazenamentoLogistico.git
```

### Acessar a Pasta do Projeto

```bash
cd ProjetodeArmazenamentoLogistico
```

### Executar a Aplicação

Linux/Mac:

```bash
./mvnw spring-boot:run
```

Windows:

```bash
mvnw.cmd spring-boot:run
```
---

## 🎨 Link do Protótipo

Protótipo disponível no Figma:

https://www.figma.com/design/Fqm6snmQq3kKHZqKHD32Up/Sem-t%C3%ADtulo?node-id=0-1&t=nEhTsZnB4IvxOPzZ-1

---

## 👥 Equipe de Desenvolvimento

| Foto | Integrante | GitHub |
|------|------------|--------|
| <img src="https://github.com/MarceloHmarques.png" width="100"> | Marcelo Henrique de Lima Marques | [@MarceloHmarques](https://github.com/MarceloHmarques) |
| <img src="https://github.com/alissonricarte.png" width="100"> | Alisson Lima Ricarte | [@alissonricarte](https://github.com/alissonricarte) |
| <img src="https://github.com/DaviFreita.png" width="100"> | Davi da Silva Freitas | [@DaviFreita](https://github.com/DaviFreita) |
| <img src="https://github.com/Juanpablouf.png" width="100"> | Juan Pablo Silva Valdivino | [@Juanpablouf](https://github.com/Juanpablouf) |

---

## 📌 Status Atual do Desenvolvimento

🚧 Em desenvolvimento

O sistema encontra-se em desenvolvimento e aprimoramento contínuo pela equipe do projeto.

---

## 🏛 Instituição

**Universidade Federal Rural do Semi-Árido (UFERSA)**

**Curso:** Interdisciplinar em Tecnologia da Informação

**Disciplina:** Engenharia de Software

---
