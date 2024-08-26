package com.mycompany.luisprincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public abstract class Juridica {
    protected String cnpj;
    protected String incricaoEstadual;

    public Juridica(String cnpj, String incricaoEstadual) {
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    } 

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    @Override
    public String toString() {
        return  "\nCNPJ: " + cnpj + "Incrição Estadual: " + incricaoEstadual;
    }
    
    
    
}
