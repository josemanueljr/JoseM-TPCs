/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Classe Banco que receberá diversas contas.
 * @author JoseM
 */
public class Banco implements Imprimivel{
    ArrayList<ContaBancaria> contas=new ArrayList();
    
    /**
     * Método para inserir contas
     * @param conta Conta a ser inserida
     */
    public void inserir(ContaBancaria conta){
        contas.add(conta);
    }
    /**
     * Método para remover conta
     * @param conta Conta a ser removida.
     */
    public void remover(ContaBancaria conta){
        try {
      
      contas.remove(conta);
    } catch (IndexOutOfBoundsException e) {}
    }
    
    public ContaBancaria pesquisa(int numero){
        ContaBancaria contaSearch;
        
        for(int i=0; i<contas.size();i++){
            contaSearch=contas.get(i);
            if(contaSearch.getNumeroDeConta()==numero){
            return contaSearch;
        }
        }
        
        return null;
    }

    @Override
    public void mostrarDados() {
        ContaBancaria aux;
        for(int i=0; i<contas.size();i++){
            aux=contas.get(i);
            if(aux instanceof ContaCorrente){
                ContaCorrente cc=(ContaCorrente)aux;
                System.out.println("NrConta:"+cc.getNumeroDeConta()+" saldo:"+cc.getSaldo()+" Limite: "+cc.getTaxaDeOperacao());
            }else{
                ContaPoupanca cp=(ContaPoupanca)aux;
                System.out.println("NrConta:"+cp.getNumeroDeConta()+" saldo:"+cp.getSaldo()+" Limite: "+cp.getLimite());
            }
        }
        
    }
    
}
