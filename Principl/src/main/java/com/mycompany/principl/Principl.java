/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principl;

/**
 *
 * @author DELL
 */
public class Principl {

    public static void main(String[] args) {
      Clientes clientes = new Clientes("Luis", "18");
      
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade());
        
    }
}
