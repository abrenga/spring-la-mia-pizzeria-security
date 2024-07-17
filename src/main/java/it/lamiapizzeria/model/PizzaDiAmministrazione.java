package it.lamiapizzeria.model;

import java.util.List;

public class PizzaDiAmministrazione {
    private ModelofmenuDB nomePizzaAmministratore;

    private List<ModelOfSpecialPrice> SpecialPriceAmministratore;
    private  List<Ingredients> ingredients;

    public PizzaDiAmministrazione(ModelofmenuDB nomePizzaAmministratore, List<ModelOfSpecialPrice> SpecialPriceAmministratore, List<Ingredients>ingredients) {
        this.nomePizzaAmministratore = nomePizzaAmministratore;
        this.SpecialPriceAmministratore = SpecialPriceAmministratore;
        this.ingredients= ingredients;
    }


    public ModelofmenuDB getNomePizzaAmministratore() {
        return nomePizzaAmministratore;
    }
    public List<ModelOfSpecialPrice> getSpecialPriceAmministratore() {
        return SpecialPriceAmministratore;
    }

    public void setNomePizzaAmministratore(ModelofmenuDB nomePizzaAmministratore) {
        this.nomePizzaAmministratore = nomePizzaAmministratore;
    }

    public void setSpecialPriceAmministratore(List<ModelOfSpecialPrice> specialPriceAmministratore) {
        SpecialPriceAmministratore = specialPriceAmministratore;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
