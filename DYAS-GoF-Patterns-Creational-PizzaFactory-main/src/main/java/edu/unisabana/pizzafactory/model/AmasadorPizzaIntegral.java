
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class AmasadorPizzaIntegral implements Amasador {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    } 
}