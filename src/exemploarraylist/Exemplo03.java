/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")));
        }
    }
    
}
