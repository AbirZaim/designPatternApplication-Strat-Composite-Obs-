package dp.exam.demo.AspectAOP;

import dp.exam.demo.security.SecContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class authorisationAspect {
    @Around(value= "@annotation(secured)", argNames = "pj,secured")
    public Object secure(ProceedingJoinPoint pj, SecuredByAspect secured) throws Throwable{
        //recup les roles:
        String[] roles = secured.roles();
        //verifier que l'user a lun des roles
        boolean auth = false;
        for (String role: roles){
            if (SecContext.hasRRole(role)) {auth = true; break;}
        }

        if(auth == true){
            Object res = pj.proceed();
            return res;
        }
        throw  new RuntimeException("Unauthorizedd");

    }
}
