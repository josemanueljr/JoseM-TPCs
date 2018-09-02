/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;

import java.util.Vector;

/**
 *
 * @author JoseM
 */
public class OrdenarVector {
    
    public Vector<Integer> ordena(Vector<Integer> vectorDesord){
        Vector<Integer> vectorOrd=new Vector<>();
        vectorOrd.setSize(vectorDesord.size());
        int maior=Integer.MIN_VALUE;
        int indice=-1;
        for(int i=vectorOrd.size()-1;i>=0;i--){
            maior=Integer.MIN_VALUE;
            for(int j=0;j<vectorDesord.size();j++){
                if(vectorDesord.get(j)>maior){
                    maior=vectorDesord.get(j);
                    indice=j;
                   // System.out.println("Maior é"+maior);
                }
               // System.out.println("Executa Ciclo iteracao"+j);
            }
            System.out.println("Maior : "+maior);
            vectorOrd.set(i, maior);
            vectorDesord.remove(indice);
            //System.out.println("Tamanho Array Desordenado "+vectorDesord.size());
            //vectorDesord.set(indice, Integer.MIN_VALUE);
            
            
        }
        
        
        return vectorOrd;
    }
    
}
