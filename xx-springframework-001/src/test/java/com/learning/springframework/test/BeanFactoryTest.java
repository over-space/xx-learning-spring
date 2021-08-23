package com.learning.springframework.test;

import com.learning.springframework.BeanDefinition;
import com.learning.springframework.BeanFactory;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {

    @Test
    public void test(){
        BeanFactory beanFactory = new BeanFactory();

        beanFactory.registerBeanDefinition(UserService.class.getSimpleName(), new BeanDefinition(new UserService()));

        UserService bean = (UserService) beanFactory.getBean(UserService.class.getSimpleName());

        Integer age = bean.queryEmployeeAge();

        System.out.println(age);
    }

}
