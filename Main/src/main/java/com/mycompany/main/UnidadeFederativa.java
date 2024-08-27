/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    BAHIA(" Bahia", "BA"), 
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String texto;
    private String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
