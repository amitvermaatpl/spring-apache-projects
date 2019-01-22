package com.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder{

	// This is a complete Camel route definition! //
	@Override
	public void configure() throws Exception {		
		/*
		 * Receive message from an endpoint i.e. file, using *file:* component/adapter
		 * EIP: from() and to() are the Enterprise Integration Patterns like .log() etc.
		 */
		from("file:C://inputFolder?noop=true").to("file:C://outputFolder");
		
	}

}
