package dp.exam.demo.surfaceStrat;

import dp.exam.demo.AspectAOP.Log;
import dp.exam.demo.AspectAOP.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class CalculSurfaceRect extends CalculSurface {
    @Override
    @Log
    @SecuredByAspect(roles={"USER", "ADMIN"})
    public double CalculS() {
        return getG().getDimX()*getG().getDimY();
    }
}
