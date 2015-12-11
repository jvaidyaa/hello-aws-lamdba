package org.gradle;

import org.gradle.model.Request;
import org.gradle.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;
public class HelloController {

	static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	// Our lambda function handler
   public Response getHello(Request request, Context context) {
	  LOGGER.info("LAMBDA FUNCTION INITIALIZED  SUCCESSFULLY !!");
	   Response responseObj = new Response();
	   responseObj.setResponse(request.getFirstName());
	   return responseObj;
    }
}
