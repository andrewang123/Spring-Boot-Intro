package starterspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // tells Springboot that this is the starting point for out spring app
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
