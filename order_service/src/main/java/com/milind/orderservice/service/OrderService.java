package com.milind.orderservice.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.milind.orderservice.client.OrderProcessorClient;

@Component
public class OrderService {

	private static Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	@Autowired
	OrderProcessorClient orderProcessing;
	
	public String createOrder(String orderJson) {
		logger.debug("Trying to Create the Order by calling external Service: "+orderJson);
		return orderProcessing.processOrder(orderJson);
		//return Long.toString(RandomUtils.nextLong());
	}
}
