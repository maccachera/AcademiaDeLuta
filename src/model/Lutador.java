package model;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

public class Lutador extends Pessoa {


    private double peso;
    private List<String> modalidades;
    private int vitorias;
    private int derrotas;
    private int empates;
    private Treinador treinador;



    public Lutador(String nome, String cpf, LocalDate dataNascimento, double peso) {
        super(nome, cpf, dataNascimento);
        this.peso = peso;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.modalidades = new ArrayList<>();
    }


    public void adicionarModalidade(String novaModalidade){
        if(novaModalidade == null || novaModalidade.isBlank() ){
            return ;
        }
        this.modalidades.add(novaModalidade);
    }

    public void exibirCartel() {
        System.out.printf("Cartel: %d-%d-%d%n", this.vitorias, this.derrotas, this.empates);
    }

    public void atacar() {
        System.out.println("O lutador desferiu um golpe genérico.");
    }

    public void baterPeso() {
        System.out.println("Subiu na balança e atingiu o limite da categoria: " + this.peso + " kg.");
    }







}
