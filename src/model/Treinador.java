package model;
import java.time.LocalDate;


public class Treinador extends Pessoa {
    private String especialidade;

    public Treinador(String nome, String cpf, LocalDate dataNascimento, String especialidade) {
        super(nome, cpf, dataNascimento);
        this.especialidade = especialidade;
    }








}
