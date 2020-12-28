package ru.vdv.tregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SecurityAspect {

    @Before("ru.vdv.tregulov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecuritygAdvice: проверка прав на получение книги/журнала");
        System.out.println("_______________________________________________________");
    }
}
