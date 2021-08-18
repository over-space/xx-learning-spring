package com.learning.springframework.beans.factory;

import com.learning.springframework.beans.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
