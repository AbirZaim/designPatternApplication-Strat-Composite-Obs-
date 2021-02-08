package dp.exam.demo;

import dp.exam.demo.composite.Cercle;
import dp.exam.demo.composite.Dessin;
import dp.exam.demo.composite.Figure;
import dp.exam.demo.composite.Rectangle;
import dp.exam.demo.perimStrat.CalculPerimetreCercle;
import dp.exam.demo.security.SecContext;
import dp.exam.demo.surfaceStrat.CalculSurfaceCercle;
import dp.exam.demo.traitement.traiterImpl;
import javafx.scene.shape.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DessinApplication {

    public static void main(String[] args) {
        SecContext.authenticate("root","1234",new String[]{"USER", "ADMIN"});
        //SecContext.authenticate("rt","1234",new String[]{"USER", "ADMIN"});
        SpringApplication.run(DessinApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Cercle d, Parametrage p)
    { return args -> {
        Point point = new Point(4,5);
        Dessin c = new Cercle();
        Grandeurs grCercle = new Grandeurs(new CalculSurfaceCercle(), new CalculPerimetreCercle(), point, 15.2,15.2);
        Parametrage prCercle = new Parametrage(2, "Black", "Red");
            d.setG(grCercle);
            d.setP(prCercle);
            d.setTraitement(new traiterImpl());
            p.add(c);
            d.getTraitement().traiter();

            p.ChangeState(6, "Blue", "white");
        };
    }
}
