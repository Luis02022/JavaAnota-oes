/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public class Advogado extends Funcionario{
    private String cab;

    public Advogado(String cab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.cab = cab;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }
    
    
    
}
