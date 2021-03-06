package es.upm.miw.iwvg.ecosystem.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);// mvn clean spring-boot:run
    }

}
