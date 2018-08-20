/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Classe Abstracta para a conta bancária. 
 * @author JoseM
 */


public abstract class ContaBancaria {
    private int numeroDeConta;
    private double saldo;
    private String historico;
    
    
    /**
     * Metodo abstracto para levantamento.
     * 
     * @param valor recebe por parametro o valor
     */
    public abstract void sacar(double valor);

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public ContaBancaria(int numeroDeConta, double saldo, String historico) {
        this.numeroDeConta = numeroDeConta;
        this.saldo = saldo;
        this.historico = historico;
    }
    
    /**
     * Método Abstracto para o depósito.
     * @param valor 
     */
    public abstract void depositar(double valor);
    
}
