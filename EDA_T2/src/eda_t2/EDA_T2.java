/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda_t2;

/**
 *
 * @author JoseM
 */
public class EDA_T2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int resultado;
        int [] vect= {0,2,4,5,6,8,9,10,11,12,13};
       // vect={};
        resultado= buscaBinaria(4, 11, vect);
        System.out.println("Resultado :"+resultado);
                
    }
    
    static int buscaBinaria(int x, int n, int [] v){
     
        int e, m, d;
        e=0; d= n-1;
        while (e<=d){
            m=(e+d)/2;
            if(v[m]==x) return m;
            if(v[m]<x)e=m+1;
            else d=m-1;
        }
        
        return -1;
    }
    
}
