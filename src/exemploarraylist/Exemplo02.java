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
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Eu aqui");
  //      nomes.add("Ponei");
  //      nomes.add("Homem da cadeira Ambulante"); 
        
        int quantidadeDeIntensNoArrayList = nomes.size();
        System.out.println(quantidadeDeIntensNoArrayList);
        
      //  String nome0 = nomes.get(0), nome1 = nomes.get(1);
        String maiorNome = "";
        
        if(nomes.get(0).length() > maiorNome.length()){
            maiorNome = nomes.get(0);
            
        }
        
         if(nomes.get(1).length() > maiorNome.length()){
            maiorNome = nomes.get(1);
            
        }
         
         System.out.println("Maior nome: " + maiorNome);
         
         String menorNome = "";
         for(int i = 65; i <= 90; i++){
             for(int j = 65; j <= 90; j++){
                 menorNome += (char) i + "" + (char) j + "\n";
             }
         }
          System.out.println(menorNome);
          if(nomes.get(0).length() < menorNome.length()){
            menorNome = nomes.get(0);
            
        }
        
         if(nomes.get(1).length() < menorNome.length()){
            menorNome = nomes.get(1);
            
        }
         
         
         
         
        
        
    }
    
}
