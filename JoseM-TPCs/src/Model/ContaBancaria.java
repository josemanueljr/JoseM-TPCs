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
    
    public abstract void depositar(double valor);
    
}
