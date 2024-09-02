package brianpelinku.u5w1d1.configurations;

import brianpelinku.u5w1d1.entities.Bevande;
import brianpelinku.u5w1d1.entities.Menu;
import brianpelinku.u5w1d1.entities.Pizza;
import brianpelinku.u5w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    // toppings
    @Bean
    public Topping prosciuttoCrudo() {
        return new Topping("prosciutto crudo", 100, 1.5);
    }

    @Bean
    public Topping mozzarellaBufala() {
        return new Topping("mozzarella di bufala", 200, 2.5);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("salame piccante", 150, 1.5);
    }

    @Bean
    public Topping salsiccia() {
        return new Topping("salsiccia", 150, 1.5);
    }

    // pizze
    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 1000, 5);
    }

    @Bean
    public Pizza piccantina() {
        Pizza pizza = new Pizza("Piccantina", 1000, 6.5);
        pizza.aggiungiTopping(salamePiccante());
        return pizza;
    }

    @Bean
    public Pizza diavolina() {
        Pizza pizza = new Pizza("Diavolina", 1500, 8);
        pizza.aggiungiTopping(salamePiccante());
        pizza.aggiungiTopping(salsiccia());
        return pizza;
    }

    @Bean
    public Pizza bufalotta() {
        Pizza pizza = new Pizza("Bufalotta", 1500, 8);
        pizza.aggiungiTopping(prosciuttoCrudo());
        pizza.aggiungiTopping(mozzarellaBufala());
        return pizza;
    }

    // bevande
    @Bean
    public Bevande acquaNat() {
        return new Bevande("Acqua Naturale", 100, 2);
    }

    @Bean
    public Bevande acquaFriz() {
        return new Bevande("Acqua Frizzante", 100, 2);
    }

    @Bean
    public Bevande cocaCola() {
        return new Bevande("Coca Cola", 500, 4);
    }

    // menu
    @Bean
    public Menu menu(Pizza margherita, Pizza piccantina, Pizza diavolina, Pizza bufalotta, Bevande acquaNat, Bevande acquaFriz, Bevande cocaCola) {
        Menu menu = new Menu();
        menu.aggiungiPizza(margherita);
        menu.aggiungiPizza(piccantina);
        menu.aggiungiPizza(diavolina);
        menu.aggiungiPizza(bufalotta);
        menu.aggiungiBevanda(acquaNat);
        menu.aggiungiBevanda(acquaFriz);
        menu.aggiungiBevanda(cocaCola);
        return menu;
    }
}
