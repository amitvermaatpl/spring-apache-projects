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
	/* * 
	 * In Spring Boot: there is no need to create a Camel-Context object and add router to context, like-
	 * CamelContext context = new DefaultCamelContext()
	 * context.addRoutes(new FileRoute());
	 * context.start();
	 * * 
	 */
}
