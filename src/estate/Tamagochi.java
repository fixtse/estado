/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estate;

import estados.Contenta;
import estados.Hambrienta;
import estados.estado;

/**
 *
 * @author fixt
 */
public class Tamagochi {
     private estado Estado;

    public Tamagochi() {
        this.Estado = new Hambrienta(this);
        
        
    }

    public void setE(estado Estado) {
        this.Estado = Estado;
       
    }
    
    public void come(){
        this.Estado.come();
       
        
    }
    
    public void juega(){
        this.Estado.juega();
       
    }
            
    
    
}
