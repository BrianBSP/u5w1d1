package brianpelinku.u5w1d1.entities;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double calorie;
    private double prezzo;
    private List<Topping> toppings;

    public Pizza(String nome, double calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;

    }

    public void aggiungiTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getTotalePrezzo() {
        return prezzo + toppings.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    public double getTotaleCalorie() {
        return prezzo + toppings.stream().mapToDouble(Topping::getCalorie).sum();
    }

}
