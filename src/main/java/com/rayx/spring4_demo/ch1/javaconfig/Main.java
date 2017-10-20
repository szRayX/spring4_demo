package com.rayx.spring4_demo.ch1.javaconfig;

import com.rayx.spring4_demo.ch1.di.DiConfig;
import com.rayx.spring4_demo.ch1.di.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/10/20.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        com.rayx.spring4_demo.ch1.di.UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("world"));
        context.close();
    }
}
