/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.luisprincipal;

/**
 *
 * @author DELL
 */
public class LuisPrincipal {
    public static void main(String[] args) {
        Endereco pessoa = new Endereco("Residência", "4", "Praça", "4170125-520", "Salvador", UnidadeFederativa.BAHIA, "Luis", "7198655654", "luisfasdf@gmail.com");
        Cliente cliente = new Cliente("65545645", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "05/10/2005");
        PrestacaoServico prestacaoServico = new PrestacaoServico("01/05/2018", "25/10/2020", "8484897484", "545466666");
         //Juridica juri = new Juridica(cnpj, incricaoEstadual);
        
        System.out.println(pessoa.toString());
        System.out.println(cliente.toString());
        System.out.println(prestacaoServico.toString());
        
    
    
    }
    }
            
