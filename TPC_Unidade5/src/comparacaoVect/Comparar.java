/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaoVect;

import java.util.Vector;

/**
 *
 * @author JoseM
 */
public class Comparar {
    
    public String compara(Vector<Boolean> vect1, Vector<Boolean> vect2){
        boolean verdadeiro=true;
        
        if(vect1.size()!=vect2.size()){
            return "Diferente";
        }
        else {
            for(int i=0;i<vect1.size();i++){
            if(vect1.get(i)!=vect2.get(i)){
                verdadeiro=false;
            }
            }  
        }
        
     if (verdadeiro=true){
         return "Diferente";
     } else return "iguais";   
        
    }
    
}
