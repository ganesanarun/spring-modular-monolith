package org.engineering.tripsmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({TripsManagementConfiguration.class})
class TripsManagementApplicationTests {

	@Test
	void contextLoads() {
	}

}
