/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estatistica;

import java.util.Vector;

/**
 *
 * @author JoseM
 */
public class Estatistica {
    
    
     public int moda(Vector <Integer> vect, int tamanho){
         int vModa=0;
         int repeticoes=0;
         int comparacao=0;
         for(int i=0;i<tamanho;i++){
             repeticoes=0;
             for(int j=i+1;j<tamanho;j++){
                 if(vect.get(i)==vect.get(j)){
                     repeticoes++;
                 }
             }
             if(repeticoes>comparacao){
                 vModa=(int)vect.get(i);
                 comparacao=repeticoes;
             }           
         }
         
         return vModa;
     }
}
