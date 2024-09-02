package brianpelinku.u5w1d1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Bevande> bevande;

    public void aggiungiPizza(Pizza pizza) {
        pizze.add(pizza);
    }

    public void aggiungiBevanda(Bevande bevanda) {
        bevande.add(bevanda);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- MENU ----\n");
        sb.append("-- Pizze: \n");
        pizze.forEach(pizza -> sb.append(pizza).append("\n"));
        sb.append("-- Bevande: \n");
        bevande.forEach(bevanda -> sb.append(bevanda).append("\n"));
        return sb.toString();
    }

}
