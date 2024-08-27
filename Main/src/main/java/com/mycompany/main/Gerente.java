/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

   
    @Override
    public double salarioFinal() {
        salarioFinal = 0;
        salarioFinal = super.salario * super.bonificacao.GERENTE.getValor();
        salarioFinal += super.salario;
        return SalarioFinal;
    }

    
    
}
