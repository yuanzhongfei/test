package sprincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker   //熔断机制
public class provider {
    public static void main(String[] args) {
        SpringApplication.run(provider.class,args);
    }
}
