package ru.vdv.tregulov.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.vdv.tregulov.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
