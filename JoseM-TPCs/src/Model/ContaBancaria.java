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
    /**
     * Declaração das variáveis numeroConta, saldo, historico.
     */
    private int numeroDeConta;
    private double saldo;
    private String historico;
    
    
    /**
     * Metodo abstracto para levantamento.
     * 
     * @param valor recebe por parametro o valor
     */
    public abstract void sacar(double valor);
    
    /**
     * Metodo para devolver Numrode conta
     * @return devolve o número de conta.
     */
    public int getNumeroDeConta() {
        return numeroDeConta;
    }
    /**
     * metodo para definir o número de conta
     * @param numeroDeConta Recebe o número de conta.
     */
    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }
    /**
     * Metodo para obter o saldo
     * @return devolve o saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método para alterar o saldo
     * @param saldo Parametro Saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo para obter o histórico
     * @return Historico
     */
    public String getHistorico() {
        return historico;
    }
    
    /**
     * Altera o historico
     * @param historico  recebe um texto do historico.
     */
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    /**
     * Método para transferencia de dinheiro.
     * @param valor Recebe o valor a transferir
     * @param conta conta do beneficiario
     */
    public void transferir(double valor, ContaBancaria conta){
        if(valor<this.saldo){
            this.sacar(valor);
            conta.depositar(valor);
        }else System.out.println("Valor não disponível na conta");
    }
    /**
     * Metodo contrutor da classe
     * @param numeroDeConta Numero da conta
     * @param saldo Saldo da conta
     * @param historico Histórico
     */
    public ContaBancaria(int numeroDeConta, double saldo, String historico) {
        this.numeroDeConta = numeroDeConta;
        this.saldo = saldo;
        this.historico = historico;
    }
    
    /**
     * Método Abstracto para o depósito.
     * @param valor Valor do deposito
     */
    public abstract void depositar(double valor);
    
}
