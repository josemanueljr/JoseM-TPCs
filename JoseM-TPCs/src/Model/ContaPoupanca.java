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
    
    private double limite;

    public ContaPoupanca(double limite, int numeroDeConta, double saldo, String historico) {
        super(numeroDeConta, saldo, historico);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
        if (getSaldo()>valor+limite){
            setSaldo(getSaldo()-valor);
            System.out.println("Valor levantado com sucesso");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nr+Conta:"+getNumeroDeConta()+" saldo:"+getSaldo()+" Limite:"+getLimite());
    }
    
}
