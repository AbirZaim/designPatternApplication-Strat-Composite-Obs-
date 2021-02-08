package dp.exam.demo.traitement;

import dp.exam.demo.AspectAOP.Log;
import dp.exam.demo.AspectAOP.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class traiterImpl implements traiter {
    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public void traiter() {
        System.out.println("Traitemeent");
    }
}
