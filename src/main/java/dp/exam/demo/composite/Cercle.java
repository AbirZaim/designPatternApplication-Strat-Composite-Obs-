package dp.exam.demo.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
public class Cercle extends Dessin {
    @Override
    public void update() {
        System.out.println("Circle parametre updated !");
    }
}
