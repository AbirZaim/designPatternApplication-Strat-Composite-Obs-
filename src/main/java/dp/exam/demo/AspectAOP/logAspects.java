package dp.exam.demo.AspectAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

//Pour etre instancé par spring avant l'execution
@Component
@Aspect
//Permet à spring de chercher les pointcut et générer un prosy qui permet d'implementer le codeAdvice
@EnableAspectJAutoProxy
public class logAspects {

    Logger logger = Logger.getLogger(logAspects.class.getName());
    public logAspects() throws IOException {
        //enregistrer la journalisation dans un fichier .xml
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }

    @Around("@annotation(dp.exam.demo.AspectAOP.Log)")
    public Object log(ProceedingJoinPoint jp) throws Throwable{
        long t1 = System.currentTimeMillis();
        logger.info("From loggin aspect Before "+ jp.getSignature());
        Object o = jp.proceed();
        long t2 = System.currentTimeMillis();
        logger.info("From loggin After----------------------");
        logger.info("Duration " + (t2-t1));
        System.out.println("res : " + o);
        return o;
    }
}
