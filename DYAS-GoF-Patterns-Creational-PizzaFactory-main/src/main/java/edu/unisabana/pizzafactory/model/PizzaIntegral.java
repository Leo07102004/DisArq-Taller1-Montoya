
package edu.unisabana.pizzafactory.model;

public class PizzaIntegral extends Pizza {
    @Override
    public Amasador crearAmasador(){
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador(){
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador(){
        return new HorneadorPizzaIntegral();
    }
}
