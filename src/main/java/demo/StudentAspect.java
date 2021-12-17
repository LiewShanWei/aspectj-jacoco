package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAspect {
    @Pointcut("execution(* *.*(..)) && !execution(* $jacoco*(..)) && !within(MyAspect)")
    public void allMethods(){}

    @Around("allMethods()")
    public Object allConcrete(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Start Aspect");
        Object result = pjp.proceed();
        System.out.println("End Aspect");

        return result;
    }
}
