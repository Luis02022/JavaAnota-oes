/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    OPERACAO("Operação"),
    FINANCCEIRO("Financeiro");
    
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
