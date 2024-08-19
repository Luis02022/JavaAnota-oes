package com.mycompany.principa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private Endereco ender;

    public Pessoa(int id, String nome, String telefone, Endereco ender) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.ender = ender;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  "\nID=" + id + 
                "\nNome=" + nome + ", Telefone=" + telefone + ", Enderço=" + ender;
    }
    
    
    
    
    
}
