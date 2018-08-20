/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Imprimivel;

/**
 * Classe Que vai mostrar o relatório.
 * @author JoseM
 */
public class Relatorio {
    
    public void gerarRelatorio(Imprimivel imprime){
        imprime.mostrarDados();
    }
    
}
