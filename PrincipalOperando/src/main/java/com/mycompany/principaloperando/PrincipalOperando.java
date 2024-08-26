/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principaloperando;

/**
 *
 * @author DELL
 */
public class PrincipalOperando {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(4, 6));
        System.out.println("Subtracao: " + subtracao.calcular(4, 6));
        System.out.println("Multiplicacao: " + mult.calcular(4, 6));
        System.out.println("Divisao: " + div.calcular(4, 6));
    }
}
