package brianpelinku.u5w1d1;

import brianpelinku.u5w1d1.configurations.PizzaConfig;
import brianpelinku.u5w1d1.entities.Menu;
import brianpelinku.u5w1d1.entities.Pizza;
import brianpelinku.u5w1d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5w1d1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5w1d1Application.class);

        Menu menu = context.getBean(Menu.class);

        menu.printMenu();

        context.close();
    }


}
