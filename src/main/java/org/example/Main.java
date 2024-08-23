package org.example;

import org.example.controller.BdPet;
import org.example.controller.BdPetShop;
import org.example.model.Cliente;
import org.example.model.Pet;

public class Main {
    public static void main(String[] args) {
        BdPet BdPet = new BdPet();

        Cliente c = new Cliente("Wilismar Passos",45,"04525698515", null);
        Pet p = new Pet("Salsicha",4,'f',1.33, c);
        c.setP(p);

        BdPet.cadastrar(p);
    }
}