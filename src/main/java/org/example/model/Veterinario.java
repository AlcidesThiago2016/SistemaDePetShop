package org.example.model;

public class Veterinario extends Funcionario{

    private String nConselho;

    public Veterinario(String nome, char sexo, int idade, double salario, String nConselho) {
        super(nome, sexo, idade, salario);
        this.nConselho = nConselho;
    }

    public String getnConselho() {
        return nConselho;
    }

    public void setnConselho(String nConselho) {
        this.nConselho = nConselho;
    }

    public void avaliarPet(Pet p){

    }

    public void prescrever(Pet p){

    }
}
