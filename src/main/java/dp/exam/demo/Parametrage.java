package dp.exam.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data @AllArgsConstructor @NoArgsConstructor
public class Parametrage extends IObservable {
    private int epaisseur;
    private String couleurContour;
    private String couleurRemp;

    @Override
    public void ChangeState(int e, String cc, String cr) {
        this.epaisseur = e;
        this.couleurContour= cc;
        this.couleurRemp = cr;
    }
}
