/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
         Livro livro = new Livro("Eminem", "Hohn major", 50, 15.25);
         Livro livro2 = new Livro("Martins", "Beans", 400, 200.90);
         
         System.out.println("\n");
         System.out.println("Título do livro: " + livro.getTitulo());
         System.out.println("Autor do livro: " + livro.getAutor());
         System.out.println("Páginas do livro: " + livro.getNumeroPaginas());
         System.out.println("Preço do livro: " + livro.getPreco());

         
         System.out.println("\n");
         System.out.println("Título do livro: " + livro2.getTitulo());
         System.out.println("Autor do livro: " + livro2.getAutor());
         System.out.println("Páginas do livro: " + livro2.getNumeroPaginas());
         System.out.println("Preço do livro: " + livro2.getPreco());

    }
}
