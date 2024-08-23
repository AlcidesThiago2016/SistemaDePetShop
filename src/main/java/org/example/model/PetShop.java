package org.example.model;

import java.util.ArrayList;

public class PetShop {
    private String nome;
    private String telefone;
    private String whatsApp;
    private String instagram;

    ArrayList<Cliente> clientes;

    public PetShop(String nome, String telefone, String whatsApp, String instagram) {
        this.nome = nome;
        this.telefone = telefone;
        this.whatsApp = whatsApp;
        this.instagram = instagram;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void apresentarPetShop() {

    }

    public void relatorioMensal(){

    }

    public void relatorioDia(){

    }

    public void relatorioAnual(){

    }

    public void relatorioSemanal(){

    }
}
