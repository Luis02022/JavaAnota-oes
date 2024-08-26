/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public abstract class Funcionario {
     protected String nome;
     protected String dataDeNascimento;
     protected double salarioBase;
     protected Sexo sexo;
     protected Setor setor;

    public Funcionario(String nome, String dataDeNascimento, double salarioBase, Sexo sexo, Setor setor) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salarioBase = salarioBase;
        this.sexo = sexo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
     
     
    public abstract double salarioFinal();
    
}
