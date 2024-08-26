/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author DELL
 */
public class Principal {

    public static void main(String[] args) {
        Pet pet = new Pet("Trovão", "5", "Pitbull", "Pequeno", "Ração");
        
        System.out.println("\t||Pet do usuário||");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Idade: " + pet.getIdade() + " anos");
        System.out.println("Raça: " + pet.getRaca());
        System.out.println("Porte: " + pet.getPorte());
        System.out.println("Aliemntação: " + pet.getAlimentacao());
        
    }
}
