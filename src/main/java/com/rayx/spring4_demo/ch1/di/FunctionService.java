package com.rayx.spring4_demo.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/10/20.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
