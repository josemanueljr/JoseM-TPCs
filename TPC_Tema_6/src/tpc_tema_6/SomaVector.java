/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc_tema_6;

import java.util.Vector;

/**
 *
 * @author JoseM
 */
public class SomaVector {
    
    public static void main(String[] args) {
        Vector<Integer> vect=new Vector<>();
        
        vect.add(1);
        vect.add(2);
        vect.add(4);
        vect.add(16);
        vect.add(7);
        
        System.out.println("A soma é: "+somaV(0,0,vect));
        
    }
    
    public static double somaV(double soma, int pos, Vector<Integer> vect){
        System.out.println("Execução"+pos );
        int tamanho=vect.size();
        if (pos==tamanho){
            return soma;
        }
        
        return somaV(soma+vect.elementAt(pos), pos+1, vect);
    }
}
