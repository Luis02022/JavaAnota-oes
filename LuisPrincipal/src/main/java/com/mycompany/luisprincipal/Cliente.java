package com.mycompany.luisprincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Cliente extends Fisica{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil ec, String dataDeNascimento) {
        super(sexo, ec, dataDeNascimento);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    

    

   
    
   
    
    
}
