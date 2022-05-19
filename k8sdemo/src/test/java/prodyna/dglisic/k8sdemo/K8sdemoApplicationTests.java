package prodyna.dglisic.k8sdemo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class K8sdemoApplicationTests {

	@InjectMocks
	K8SDemoApplication application;

	@Test
	void contextLoads() {
	}

	@Test
	void hello(){
		String response = application.hello("Dimitrije");
		assertEquals("Hello Dimitrije!", response);
	}

}
