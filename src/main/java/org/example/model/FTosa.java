package org.example.model;

public class FTosa extends Funcionario{

    private int qtdDiasTrabalhados;

    public FTosa(String nome, char sexo, int idade, double salario, int qtdDiasTrabalhados) {
        super(nome, sexo, idade, salario);
         this.qtdDiasTrabalhados = qtdDiasTrabalhados;
    }

    public int getQtdDiasTrabalhados() {
        return qtdDiasTrabalhados;
    }

    public void setQtdDiasTrabalhados(int qtdDiasTrabalhados) {
        this.qtdDiasTrabalhados = qtdDiasTrabalhados;
    }
}
