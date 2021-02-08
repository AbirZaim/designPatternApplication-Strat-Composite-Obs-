package dp.exam.demo;

import dp.exam.demo.perimStrat.CalculPerimetre;
import dp.exam.demo.surfaceStrat.CalculSurface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data @AllArgsConstructor @NoArgsConstructor
@Component
public class Grandeurs {
    public CalculSurface cs;
    public CalculPerimetre cp;

    private Point point;
    private Double dimX;
    private Double dimY;

    public void CalculerSurfaceStrat(){
        cs.CalculS();
    }
    public void CalculerPerimStrat(){
        cp.CalculP();
    }
}
