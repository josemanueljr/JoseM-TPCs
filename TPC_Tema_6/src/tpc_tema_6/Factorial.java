/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc_tema_6;

import javax.swing.JOptionPane;

/**
 *
 * @author JoseM
 */
public class Factorial {
    
    public static void main(String[] args) {
        
        System.out.println("O factorial é: "+factorial(Integer.parseInt(JOptionPane.showInputDialog("Introduza o número a calcular"))));
        
    }
            
    
    public static int factorial(int numero){
    
        if(numero==1 || numero==0){
            return 1;
        }
        else{
            return numero*factorial(numero-1);
        }
        
    }
}
