package com.desmond.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guoguangxian
 * @description
 * @date Created in 2020/7/17
 */
public class BeanMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object student = context.getBean("student");
		System.out.println(student);
	}
}
