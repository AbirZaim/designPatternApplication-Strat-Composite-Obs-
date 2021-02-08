package dp.exam.demo.composite;

import org.springframework.stereotype.Component;

@Component
public class Rectangle extends Dessin {

    @Override
    public void update() {
        System.out.println("Rectangle updated!!!");
    }
}
