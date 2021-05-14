package com.abhishek;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

	
	 Customer c1=new Customer(1,"Abhishek Singh",568885, new Address("canning street","kolkata","west bengal", 711204,"India"));
	 Customer c2=null;
	@Test
	public void test() {
		System.out.println("executed1");
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		Customer c=(Customer)context.getBean("obj");
		assertNotNull(c);
		
	}
	@Test
	public void test1() {
		System.out.println("executed2");
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		Customer c=(Customer)context.getBean("obj");
		assertEquals(c1.getCustomerId(),c.getCustomerId());
		assertEquals(c1.getCustomerName(),c.getCustomerName());
		assertEquals(c1.getCustomerAddress().getStreet(),c.getCustomerAddress().getStreet());
		assertEquals(c1.getCustomerAddress().getCity(),c.getCustomerAddress().getCity());
		
		
		
	}

	
	
	
}
