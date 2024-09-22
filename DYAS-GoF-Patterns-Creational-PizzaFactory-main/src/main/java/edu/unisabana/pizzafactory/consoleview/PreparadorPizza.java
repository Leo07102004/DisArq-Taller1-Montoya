
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Pizza;
import edu.unisabana.pizzafactory.model.PizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaGruesa;
import edu.unisabana.pizzafactory.model.PizzaIntegral;
import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();

            Pizza pizzaDelgada = new PizzaDelgada();
            System.out.println("Preparando Pizza Delgada:");
            pp.prepararPizza(pizzaDelgada, ingredientes, Tamano.MEDIANO);

            Pizza pizzaGruesa = new PizzaGruesa();
            System.out.println("\nPreparando Pizza Gruesa:");
            pp.prepararPizza(pizzaGruesa, ingredientes, Tamano.PEQUENO);

            Pizza pizzaIntegral = new PizzaIntegral();
            System.out.println("\nPreparando Pizza Integral:");
            pp.prepararPizza(pizzaIntegral, ingredientes, Tamano.MEDIANO);
            
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Pizza pizza, Ingrediente[] ingredientes, Tamano tam)
    throws ExcepcionParametrosInvalidos {
        Amasador amasador = pizza.crearAmasador();
        Moldeador moldeador = pizza.crearMoldeador();
        Horneador horneador = pizza.crearHorneador();
        
        amasador.amasar();
        if (tam == Tamano.PEQUENO) {
            moldeador.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            moldeador.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }
        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        // Código de llamado al microcontrolador
    }


}
