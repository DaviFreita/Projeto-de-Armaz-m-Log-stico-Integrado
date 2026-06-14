# Sistema de Gerenciamento de Armazenamento Logístico Móvel - Backend

## 📖 Sobre o Projeto

Este projeto corresponde ao backend do Sistema de Gerenciamento de Armazenamento Logístico Móvel, desenvolvido como atividade da disciplina de Engenharia de Software da Universidade Federal Rural do Semi-Árido (UFERSA).

O sistema foi criado para auxiliar pequenos e médios armazéns no controle de estoque, substituindo registros manuais em papel por uma solução digital mais segura, rápida e organizada. A aplicação permite gerenciar produtos, clientes, vendas e movimentações de estoque, garantindo maior confiabilidade das informações e melhor eficiência operacional.

---

## 🎯 Por que o projeto foi desenvolvido?

Durante o levantamento de requisitos, foi identificado que o controle manual do estoque gerava diversos problemas operacionais, tais como:

- Perda ou extravio de registros em papel;
- Divergência entre estoque físico e estoque registrado;
- Lentidão na conferência de mercadorias;
- Dificuldade no acompanhamento de entradas e saídas;
- Risco de erros humanos durante as operações.

Para solucionar esses problemas, foi proposta uma aplicação capaz de centralizar e automatizar o gerenciamento do armazém, fornecendo informações atualizadas em tempo real.

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

## 👥 Equipe de Desenvolvimento

| Foto | Integrante | GitHub |
|------|------------|--------|
| <img src="https://github.com/MarceloHmarques.png" width="100"> | Marcelo Henrique de Lima Marques | [@MarceloHmarques](https://github.com/MarceloHmarques) |
| <img src="https://github.com/alissonricarte.png" width="100"> | Alisson Lima Ricarte | [@alissonricarte](https://github.com/alissonricarte) |
| <img src="https://github.com/DaviFreita.png" width="100"> | Davi da Silva Freitas | [@DaviFreita](https://github.com/DaviFreita) |
| <img src="https://github.com/Juanpablouf.png" width="100"> | Juan Pablo Silva Valdivino | [@Juanpablouf](https://github.com/Juanpablouf) |

---

## 🏛 Instituição

**Universidade Federal Rural do Semi-Árido (UFERSA)**

**Curso:** Interdisciplinar em Tecnologia da Informação

**Disciplina:** Engenharia de Software

---
