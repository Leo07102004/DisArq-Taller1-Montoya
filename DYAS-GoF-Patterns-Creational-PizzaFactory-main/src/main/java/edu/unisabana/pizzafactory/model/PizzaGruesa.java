
package edu.unisabana.pizzafactory.model;

public class PizzaGruesa extends Pizza {
    @Override
    public Amasador crearAmasador(){
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador(){
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador(){
        return new HorneadorPizzaGruesa();
    }
}
