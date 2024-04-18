package org.engineering.tripsmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;

@TestConfiguration(proxyBeanMethods = false)
@Import({TripsManagementConfiguration.class})
public class TestTripsManagementApplication {


    public static void main(String[] args) {
        SpringApplication.from(TripsManagementApplication::main).with(TestTripsManagementApplication.class).run(args);
    }

}
