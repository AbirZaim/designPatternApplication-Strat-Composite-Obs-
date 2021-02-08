package dp.exam.demo.perimStrat;

import dp.exam.demo.AspectAOP.Log;
import dp.exam.demo.AspectAOP.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class CalculPerimetreCercle extends CalculPerimetre {
    @Override
    @Log
    @SecuredByAspect(roles={"USER", "ADMIN"})
    public double CalculP() {
        return 2* Math.PI * getG().getDimX();
    }
}
