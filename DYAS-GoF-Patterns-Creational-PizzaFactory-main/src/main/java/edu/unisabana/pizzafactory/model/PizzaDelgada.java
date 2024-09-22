
package edu.unisabana.pizzafactory.model;

public class PizzaDelgada extends Pizza {
    @Override
    public Amasador crearAmasador(){
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador(){
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador(){
        return new HorneadorPizzaDelgada();
    }
}
