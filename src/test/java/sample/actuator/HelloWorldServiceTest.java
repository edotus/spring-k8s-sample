package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Spring boot says bonjour from a Docker container",helloWorldService.getHelloMessage());
	}
	
}
