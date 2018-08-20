/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author JoseM
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel {
    /**
     * Variavel taxa de operação
     */
    private double taxaDeOperacao;
    /**
     * Metodo contrutor da classe ContaCorrente
     * @param taxaDeOperacao A taxa de operação para a conta
     * @param numeroDeConta O número da conta
     * @param saldo O Saldo Inicial da conta
     * @param historico O histórico
     */
    public ContaCorrente(double taxaDeOperacao, int numeroDeConta, double saldo, String historico) {
        super(numeroDeConta, saldo, historico);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    /**
     * Metodo para obter a taxa de operação
     * @return a taxa de operação
     */
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
    /**
     * Metodo para Definir a Taxa de operação
     * @param taxaDeOperacao Recebe um double sendo ele a taxa de operação
     */
    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    
    /**
     * Método Overrided da classe mãe
     * @see ContaBancaria
     * @param valor 
     */
    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-taxaDeOperacao);
        if (getSaldo()>valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Valor levantado com sucesso");
        }
    }
    
     /**
     * Método Overrided da classe mãe
     * @see ContaBancaria
     * @param valor 
     */
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()-taxaDeOperacao);
        setSaldo(getSaldo()+valor);
    }
    
     /**
     * Método Overrided da interface
     * @see Imprimivel
     * @param valor 
     */
    @Override
    public void mostrarDados() {
        System.out.println("Nr+Conta:"+getNumeroDeConta()+" saldo:"+getSaldo());
    }
    
}
