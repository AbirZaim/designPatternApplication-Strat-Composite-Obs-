package dp.exam.demo.perimStrat;

import dp.exam.demo.AspectAOP.Log;
import dp.exam.demo.AspectAOP.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class CalculPerimRect extends CalculPerimetre {
    @Override
    @Log
    @SecuredByAspect(roles={"USER", "ADMIN"})
    public double CalculP() {
        return 2* (getG().getDimX() + getG().getDimY());
    }
}
