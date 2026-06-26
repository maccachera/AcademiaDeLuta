package model;

import java.time.LocalDate;

public class LutadorBoxe extends Lutador {

    public LutadorBoxe(String nome, String cpf, LocalDate dataNascimento, double peso) {
        super(nome, cpf, dataNascimento, peso);
        adicionarModalidade("Boxe");
    }

    @Override
    public void atacar() {
        System.out.println("Desferiu uma sequência de jab e direto velozes!");
    }




}
