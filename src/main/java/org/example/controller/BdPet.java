package org.example.controller;

import org.example.model.Pet;

import java.io.*;
import java.util.ArrayList;

public class BdPet {

    private ArrayList<Pet> pets;
    private ArrayList<String> linhas;

    public BdPet() {
        pets = new ArrayList<>();
        linhas = new ArrayList<>();
        ler();
        pets = transformarEmObjetos(linhas);
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

    public void ler(){
        try {
            InputStream is = new FileInputStream("cadastro_pet.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();

            while(linha != null){
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }
            br.close();
            isr.close();
            is.close();

            System.out.println("Arquivo lido com sucesso!");
        } catch (Exception e){
            System.out.println("Erro ao ler o arquivo!");
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Pet> transformarEmObjetos(ArrayList<String> linhas){

        String itens[] = new String[5];
        Pet p;

        String nome;
        int idade;
        char sexo;
        double peso;
        String cpf;

        for(int i = 0; i < linhas.size(); i++){
            itens = linhas.get(i).split(",");

            nome = itens[0];
            idade = Integer.parseInt(itens[1]);
            sexo = itens[2].charAt(0);
            peso = Double.parseDouble(itens[3]);
            cpf = itens[4];

            p = new Pet(nome,idade,sexo,peso,null);
            pets.add(p);
        }

        return pets;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public ArrayList<String> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<String> linhas) {
        this.linhas = linhas;
    }
}
