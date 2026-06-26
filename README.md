# 🥊 Sistema de Gerenciamento de Academia de Lutas

Um projeto desenvolvido em **Java** com o objetivo principal de consolidar e aplicar na prática os conceitos fundamentais de **Programação Orientada a Objetos (POO)** e **Estruturas de Dados (Collections)**.

O sistema simula o domínio de um ecossistema de esportes de combate (MMA, Boxe, Muay Thai), gerenciando atletas, treinadores, academias (equipes) e a organização de torneios divididos por categorias de peso.

## 🎯 Objetivos de Aprendizado
Este projeto foi construído passo a passo para implementar cenários reais de arquitetura de software, englobando:
- Os 5 pilares da POO (Abstração, Encapsulamento, Herança, Polimorfismo e Interfaces).
- Relacionamentos entre classes (Associação e Agregação).
- Manipulação de Coleções Dinâmicas (`List` e `Map`).

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK)
* **Paradigma:** Orientação a Objetos
* **Controle de Versão:** Git e GitHub
* **IDE:** IntelliJ IDEA

## 🧠 Conceitos Aplicados na Prática

1. **Abstração & Encapsulamento:**
   * Criação de entidades de domínio ricas (`Pessoa`, `Lutador`, `Treinador`).
   * Proteção de dados sensíveis com modificadores `private` e métodos de acesso e comportamento (ex: `calcularIdade()`).

2. **Herança:**
   * A classe abstrata `Pessoa` atua como superclasse para `Lutador` e `Treinador`, reaproveitando atributos comuns (nome, CPF, data de nascimento).
   * Especialização de lutadores com as classes `LutadorBoxe` e `LutadorMuayThai`.

3. **Polimorfismo:**
   * Sobrescrita (`@Override`) do método `atacar()` nas classes filhas, permitindo que cada modalidade execute golpes específicos de forma dinâmica.

4. **Interfaces:**
   * Implementação do contrato `Competidor`, garantindo que todo atleta no sistema saiba executar métodos cruciais como `baterPeso()` e `lutar()`.

5. **Associação e Agregação (Relacionamentos):**
   * **1:1** - Um `Lutador` possui um `Treinador` associado.
   * **1:N** - Uma `Academia` gerencia um plantel de atletas utilizando listas dinâmicas (`ArrayList`).

6. **Java Collections Framework:**
   * Uso de **Map/HashMap** na classe `Torneio` para separar e organizar automaticamente os atletas em suas respectivas categorias de peso (*Chave: Categoria / Valor: Lista de Lutadores*).

## 📁 Estrutura do Projeto

O código-fonte está centralizado no pacote `model`, contendo as entidades de domínio:

```text
src/
 └── model/
      ├── Academia.java
      ├── Competidor.java (Interface)
      ├── Lutador.java
      ├── LutadorBoxe.java
      ├── LutadorMuayThai.java
      ├── Pessoa.java (Abstract)
      ├── Torneio.java
      └── Treinador.java
