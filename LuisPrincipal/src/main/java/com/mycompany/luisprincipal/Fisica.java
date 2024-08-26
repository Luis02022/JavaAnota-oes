package com.mycompany.luisprincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public abstract class Fisica {
    protected Sexo sexo;
    protected EstadoCivil ec;
    protected String dataDeNascimento;

    public Fisica(Sexo sexo, EstadoCivil ec, String dataDeNascimento) {
        this.sexo = sexo;
        this.ec = ec;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEc() {
        return ec;
    }

    public void setEc(EstadoCivil ec) {
        this.ec = ec;
    }

    @Override
    public String toString() {
        return "\nSexo: " + sexo + "\nEstado Civil: " + ec + "\nData De Nascimento: " + dataDeNascimento ;
    }
      
    
    
    
}
