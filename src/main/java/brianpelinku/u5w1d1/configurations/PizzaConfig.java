package brianpelinku.u5w1d1.configurations;

import brianpelinku.u5w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Topping prosciuttoCrudo(){
            return new Topping("prosciutto crudo", 100, 1.5);
    }

    @Bean
    public Topping prosciuttoCotto(){
        return new Topping("prosciutto cotto", 120, 1.5);
    }

    @Bean
    public Topping mozzarellaBufala(){
        return new Topping("mozzarella di bufala", 200, 2.5);
    }

    @Bean
    public Topping funghiFreschj(){
        return new Topping("funghi freschi", 100, 1);
    }

}
