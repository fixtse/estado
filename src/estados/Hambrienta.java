/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

import estate.Tamagochi;

/**
 *
 * @author fixt
 */
public class Hambrienta implements estado{
    private Tamagochi tam;

    public Hambrienta(Tamagochi tam) {
        this.tam = tam;
    }    
    

    @Override
    public void come() {
        tam.setE(new Contenta(tam));
        System.out.println("contenta");
    }

    @Override
    public void juega() {
        
    }
   
    
    

   
    
}
