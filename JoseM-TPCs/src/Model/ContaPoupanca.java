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
public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    /**
     * declarada Variavel Limite
     */
    private double limite;
    /**
     * Contrutor da classe Conta poupança
     * @param limite Recebe limite
     * @param numeroDeConta recebe Numerod de conta
     * @param saldo recebe Saldo
     * @param historico recebe histórico.
     */
    public ContaPoupanca(double limite, int numeroDeConta, double saldo, String historico) {
        super(numeroDeConta, saldo, historico);
        this.limite = limite;
    }
    /**
     * Metodo para obter o limite da conta
     * @return o limite da conta
     */
    public double getLimite() {
        return limite;
    }
    /**
     * Definir o limite
     * @param limite retorna o limite.
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
     /**
     * Método Overrided da classe mãe
     * @see ContaBancaria
     * @param valor 
     */
    @Override
    public void sacar(double valor) {
        if (getSaldo()+limite>valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Valor: "+valor+" levantado com sucesso na conta poupança: "+getNumeroDeConta());
            
        }else System.out.println("Valor indisponível");
        System.out.println("O seu saldo actual é: "+getSaldo());
    }
     /**
     * Método Overrided da classe mãe
     * @see ContaBancaria
     * @param valor 
     */
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
        System.out.println("Depositou com sucesso: "+valor+" MT na conta poupança: "+getNumeroDeConta());
        System.out.println("O seu saldo actual é: "+getSaldo());
    }
    /**
     * Método Overrided da interface
     * @see Imprimivel
     * @param valor 
     */
    @Override
    public void mostrarDados() {
        System.out.println("Nr+Conta:"+getNumeroDeConta()+" saldo:"+getSaldo()+" Limite:"+getLimite());
    }
    
}
