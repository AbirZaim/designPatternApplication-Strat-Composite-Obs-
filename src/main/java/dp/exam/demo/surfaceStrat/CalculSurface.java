package dp.exam.demo.surfaceStrat;

import dp.exam.demo.Grandeurs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public abstract class CalculSurface {
    private Grandeurs g;

    public abstract double CalculS();
}
