package org.example.model;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private Pet p;

    public Cliente(String nome, int idade, String cpf, Pet p) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pet getP() {
        return p;
    }

    public void setP(Pet p) {
        this.p = p;
    }
}
