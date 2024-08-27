/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public class Endereco {
    String logradouro;
    String numero;
    String complemento;
    String cep;
    String cidade;
    UnidadeFederativa uf;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return  "\nLogradouro: " + logradouro + 
                "\nNumero: " + numero + 
                "\nComplemento: " + complemento +
                "\nCEP: " + cep +
                "\nCidade: " + cidade + 
                "\nUnidade Federativa: " + uf + '}';
    }
    
    
    
    
}
