package org.example.controller;

import org.example.model.Pet;

import java.io.*;

public class BdPet {

    public BdPet() {

    }

    public void cadastrar(Pet p) {
        try {
            OutputStream os = new FileOutputStream("cadastro_pet.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = p.getNome()+","+p.getIdade()+","+p.getSexo()+","+p.getPeso()+","+p.getC().getCpf();

            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println("Pet "+p.getNome()+" cadastrado com sucesso!");
        } catch (Exception e){
            System.out.println("Erro ao abrir o arquivo!");
        }


    }

    public void alterar(Pet p) {

    }

    public void pesquisar(String nome) {

    }

    public void pesquisar(int codigo) {

    }

    public void pesquisar(String nome, int codigo) {

    }

    public void pesquisar(int codigo, String nome) {

    }

    public void excluir(Pet p) {

    }

}
