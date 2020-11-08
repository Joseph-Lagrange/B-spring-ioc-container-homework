package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private GreetingService getGreetingService() {
        return applicationContext.getBean(GreetingService.class);
    }

    @GetMapping("/greet")
    public String greet() {
        System.out.println("-----" + getGreetingService());
        return getGreetingService().sayHi();
    }
}
