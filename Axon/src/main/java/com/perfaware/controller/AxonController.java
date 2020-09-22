package com.perfaware.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AxonController {
	
	private final CommandGateway commandGateway;
	private final QueryGateway queryGateway;
	
	private AxonController(CommandGateway commandGateway, QueryGateway queryGateway) {
		this.commandGateway = commandGateway;
		this.queryGateway = queryGateway;
	}
	
	@PostMapping("/placeorder/{order}")
	@ResponseBody
	public void order(@PathVariable ("order") String order){
	}

}
