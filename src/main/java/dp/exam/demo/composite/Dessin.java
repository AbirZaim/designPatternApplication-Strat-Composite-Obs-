package dp.exam.demo.composite;

import dp.exam.demo.Grandeurs;
import dp.exam.demo.IObservable;
import dp.exam.demo.IObserver;
import dp.exam.demo.Parametrage;
import dp.exam.demo.traitement.traiter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class Dessin implements IObserver {
    private Long id;
    public Grandeurs g ;
    public Parametrage p;
    public traiter traitement;

    @Override
    public abstract void update();
}
