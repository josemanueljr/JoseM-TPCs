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
public class ContaCorrente extends ContaBancaria {

    private double taxaDeOperacao;

    public ContaCorrente(double taxaDeOperacao, int numeroDeConta, double saldo, String historico) {
        super(numeroDeConta, saldo, historico);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    
    
    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-taxaDeOperacao);
        if (getSaldo()>valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Valor levantado com sucesso");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()-taxaDeOperacao);
        setSaldo(getSaldo()+valor);
    }
    
}
