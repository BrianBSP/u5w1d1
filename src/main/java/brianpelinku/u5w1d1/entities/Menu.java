package brianpelinku.u5w1d1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Bevande> bevande;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Bevande> bevande) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Bevande> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevande> bevande) {
        this.bevande = bevande;
    }


}
