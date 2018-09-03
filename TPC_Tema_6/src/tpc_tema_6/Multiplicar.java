/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc_tema_6;

/**
 *
 * @author JoseM
 */
public class Multiplicar {
    
    public static void main(String[] args) {
        System.out.println("A multiplicacao é: "+multiplica(0, 10, 50));
    }
    
   public static int multiplica(int result, int val1, int val2){
       if (val2==0){
           return result;
       }
       
       return multiplica(result+val1,val1, val2-1);
   }
    
}
