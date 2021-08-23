package com.learning.springframework.test;

import com.learning.springframework.beans.BeansException;
import com.learning.springframework.beans.factory.config.BeanDefinition;
import com.learning.springframework.beans.factory.BeanFactory;
import com.learning.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {

    @Test
    public void test() throws BeansException {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class));

        UserService userService = (UserService) beanFactory.getBean("userService", "lisi");

        userService.queryEmployeeAge();

        UserService userService2 = (UserService) beanFactory.getBean("userService", "lisi");

        Assertions.assertTrue(userService == userService2);
    }

}
