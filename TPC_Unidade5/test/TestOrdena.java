
import Ordenar.OrdenarVector;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseM
 */
public class TestOrdena {
    
    
    public static void main(String[] args) {
        Vector<Integer> vect=new Vector<>(2);
        int numero=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduza o tamanho do array"));
        
        for(int i=0;i<numero;i++){
            vect.add(Integer.parseInt(JOptionPane.showInputDialog("Introduza o Valor "+(i+1))));
        }
        System.out.println("--------------Vector--------------");
        for(int i=0;i<numero;i++){
            System.out.print(vect.get(i)+" - ");
        }
        
        OrdenarVector ord=new OrdenarVector();
        vect=ord.ordena(vect);
        
        System.out.println("-----------Vector Ordenado-----------");
        for(int i=0;i<numero;i++){
            System.out.print(vect.get(i)+" - ");
        }
        
    }
}
