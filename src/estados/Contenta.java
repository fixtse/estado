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
public class Contenta implements estado{
    private Tamagochi tam;

    public Contenta(Tamagochi tam) {
        this.tam = tam;
    }
    
    

    @Override
    public void come() {
        tam.setE(new Aburrida(tam));
        System.out.println("Aburrida");
    }

    @Override
    public void juega() {
        tam.setE(new Hambrienta(tam));
        System.out.println("Hambrienta");
    }
    
}
