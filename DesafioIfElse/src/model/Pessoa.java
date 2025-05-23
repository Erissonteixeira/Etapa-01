package DesafioIfElse.src.model;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean eMaiorIdade;

    public Pessoa (String nome, int idade){

        this.nome = nome;
        this.idade = idade;
        this.eMaiorIdade = this.idade >= 18;

    }

    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;

    }
    public boolean eMaiorIdade(){
        return eMaiorIdade;
    }
}
