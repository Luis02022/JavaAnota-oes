package com.mycompany.inicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Veiculo {
    private String placa;
    private String cor;
    private String numeroDePassageiro;
    private String capacidadeTanque;
    private String velocidade;
    private String consumoMedio;

    public Veiculo(String placa, String cor, String numeroDePassageiro, String capacidadeTanque, String velocidade, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiro = numeroDePassageiro;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidade = velocidade;
        this.consumoMedio = consumoMedio;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePassageiro() {
        return numeroDePassageiro;
    }

    public void setNumeroDePassageiro(String numeroDePassageiro) {
        this.numeroDePassageiro = numeroDePassageiro;
    }

    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(String capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "\nPlaca: " + placa + "\nCor: " + cor + "\nNúmero De Passageiro: " + numeroDePassageiro + "\nCapacidade de Tanque: " + capacidadeTanque + " Litros" + "\nVelocidade máxima: " + velocidade + " km/h" + "\nConsumo Médio: " + consumoMedio + " litros";
    }
    
    
    
    
}
