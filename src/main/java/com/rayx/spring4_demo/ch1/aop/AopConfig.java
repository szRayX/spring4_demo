package com.rayx.spring4_demo.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created on 2017/10/20.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.rayx.spring4_demo.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
