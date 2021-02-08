package dp.exam.demo.dessinerStrat;

import org.springframework.stereotype.Component;

@Component
public class DessinerImpl implements Dessiner {
    @Override
    public void Draw() {
        System.out.println("Should draw using JAVA FX");
    }
}
