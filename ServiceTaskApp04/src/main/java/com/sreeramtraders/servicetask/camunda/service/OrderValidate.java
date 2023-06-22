package com.sreeramtraders.servicetask.camunda.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.sreeramtraders.servicetask.LoggerDelegate;

public class OrderValidate implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		LOGGER.info("OrderValidate : Execute has been called......");
		
		//Call other java classes or methods here
		
		String orderName = (String)execution.getVariable("orderName");
		
		System.out.println("Hi Praneeth 1........ the orderName is : "+orderName);
		
		execution.setVariable("isValidated", true);

	}

}
