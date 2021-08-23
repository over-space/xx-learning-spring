package com.learning.springframework.beans.factory.support;

import com.learning.springframework.beans.BeansException;
import com.learning.springframework.beans.factory.BeanFactory;
import com.learning.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = getSingleton(beanName);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        Object bean = getSingleton(beanName);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
