package com.learning.springframework;

/**
 * 定义Bean的实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
