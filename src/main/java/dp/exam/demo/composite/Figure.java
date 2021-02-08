package dp.exam.demo.composite;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Figure extends Dessin {
    private List<Dessin> list= new ArrayList<>();

    @Override
    public void update() {
        System.out.println("figures updated !");
    }

    public void addFigure(Dessin d){
        this.list.add(d);
    }
    public void removeFigure(Dessin d){ list.remove(d); }

}
