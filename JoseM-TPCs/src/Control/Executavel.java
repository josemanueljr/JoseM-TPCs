/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ContaCorrente;
import Model.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseM
 */
public class Executavel {
    /**
     * Metodo Main da classe executavel
     * @param args 
     */
    public static void main(String[] args) {
        
        ContaCorrente cc=new ContaCorrente(5, 7312345, 3000, "");
        ContaPoupanca cp=new ContaPoupanca(2000, 7412345, 5000, "");
        
    }
    
}
