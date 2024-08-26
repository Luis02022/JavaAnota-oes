/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inicio;

/**
 *
 * @author DELL
 */
public class Inicio {

    public static void main(String[] args) {
       Cliente cliente = new  Cliente("Luis", "18", "545445464", "Rua Nossa Senhora das Dores", "71-983510921");
       Veiculo veiculo = new Veiculo("RT56F4", "Preto", "4", "55", "240", "37");
       
       
       
        System.out.println(cliente.toString());
        System.out.println(veiculo.toString());
       
    }
}
