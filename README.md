# 🚗 Cadastro de Veículos 

Esse projetinho nasceu a partir do exercício de cadastro de veículos que fizemos em sala.  
A ideia era pegar o código que estava procedural e transformar em **orientado a objetos**, aplicando **abstração e encapsulamento**.

---

## O que dá pra fazer aqui

- **Cadastrar veículo** (marca, modelo, ano e placa)  
  👉 não deixa cadastrar duas placas iguais.
- **Listar veículos** (mostra todos bonitinhos com `toString()`).
- **Excluir veículo** (agora é pela placa, não pelo índice).
- **Pesquisar veículo**  
  - por **placa** (busca exata)  
  - por **modelo** (aceita parte do nome, usando `contains()`).

---

## Como funciona

Quando roda o programa, aparece o menu:

=== MENU ===
1 - Cadastrar Veículo
2 - Listar Veículos
3 - Excluir Veículo
4 - Pesquisar Veículo
0 - Sair

---

## Estrutura do código

- **Veiculo.java** → classe com atributos privados (`marca`, `modelo`, `ano`, `placa`), getters, setters, construtores e `toString()`.
- **CadastroVeiculos.java** → menu principal, lista `ArrayList<Veiculo>`, regras de negócio (cadastro sem placa repetida, exclusão por placa e pesquisa).

---

## Tecnologias utilizadas
- **Java**
- Paradigma **OO**  
- Conceitos usados: **abstração, encapsulamento, lista (`ArrayList`) e validações**

---

## Integrantes
- Maria Luiza Pereto - 113867 
- Jamile Rockenbach Ferreira - 1137704



