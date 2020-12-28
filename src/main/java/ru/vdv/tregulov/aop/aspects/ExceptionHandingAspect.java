package ru.vdv.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class ExceptionHandingAspect {

    @Before("ru.vdv.tregulov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandingAdvice() {
        System.out.println("beforeGetExceptionHandingAdvice: ловим/обрабатываем " +
                "исключения при попытке получить книгу/журнал");
        System.out.println("_______________________________________________________");
    }
}
