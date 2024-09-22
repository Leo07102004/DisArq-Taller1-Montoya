
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MoldeadorPizzaDelgada implements Moldeador {
    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
