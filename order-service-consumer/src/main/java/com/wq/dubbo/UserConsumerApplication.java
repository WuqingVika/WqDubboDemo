package com.wq.dubbo;

import java.io.IOException;

import com.wq.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserConsumerApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.initOrder("1");
		System.out.println("调用完成....");
		System.in.read();
	}

}
