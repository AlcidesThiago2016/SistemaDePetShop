package org.example.model;

public class FAdministrador extends Funcionario{

    private int qtdHorasTrabalhadas;

    public FAdministrador(String nome, char sexo, int idade, double salario, int qtdHorasTrabalhadas) {
        super(nome, sexo, idade, salario);
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public int getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public void calcularServicos(Pet p){

    }
}
