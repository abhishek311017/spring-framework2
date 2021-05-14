package com.abhishek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("que.xml");
		Hello q=(Hello)context.getBean("question1");
		q.getList();
		//q.getSet();
		//q.getMap();
	}

}
