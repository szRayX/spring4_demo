package com.rayx.spring4_demo.ch1.aop;

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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
