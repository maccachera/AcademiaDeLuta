package model;
import java.time.LocalDate;
import java.time.Period;

 public abstract class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

     public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
         if (nome == null || nome.isBlank() || cpf == null || cpf.isBlank()) {
             throw new IllegalArgumentException("Nome e CPF são obrigatórios!");
         }
         this.nome = nome;
         this.cpf = cpf;
         this.dataNascimento = dataNascimento;
     }



    public int calcularIdade(){
        if(this.dataNascimento == null){
            return 0;
        }
        LocalDate hoje = LocalDate.now();
        return Period.between(this.dataNascimento, hoje).getYears();
    }






}
