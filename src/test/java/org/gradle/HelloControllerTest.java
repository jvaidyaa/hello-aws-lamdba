package org.gradle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.gradle.model.Request;
import org.gradle.model.Response;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloControllerTest {

	private Request request;
	private Context context;

	private HelloController helloController;

	@Before
	public void setUp() throws Exception {
		 helloController = new HelloController();
		 request = mock(Request.class);
		 context = mock(Context.class);
	}

    @Test
    public void getHello() {
    	Request req = new Request();
    	req.setFirstName("DHANU");
    	Response response = helloController.getHello(req, context);
    	assertNotNull(response);
    	assertEquals("DHANU",response.getResponse());
    }
}
