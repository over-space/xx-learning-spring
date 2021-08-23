package com.learning.springframework.beans.factory.support;

import com.learning.springframework.beans.BeansException;
import com.learning.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if(ctor == null) {
                // 使用无参构造方法实例化
                return clazz.getDeclaredConstructor().newInstance();
            } else{
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
