package dp.exam.demo.perimStrat;

import dp.exam.demo.Grandeurs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public abstract class CalculPerimetre {
    private Grandeurs g;

    public abstract double CalculP();
}
