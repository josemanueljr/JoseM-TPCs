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
public class Banco {
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
    
}
