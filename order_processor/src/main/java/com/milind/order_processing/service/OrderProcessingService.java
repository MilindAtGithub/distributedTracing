package com.milind.order_processing.service;

import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessingService {

	private static Logger logger = LoggerFactory.getLogger(OrderProcessingService.class);
	public String processOrder(String json) {
		logger.debug("Proceesed the Order: "+json);
		return Long.toString(RandomUtils.nextLong());
	}
}
