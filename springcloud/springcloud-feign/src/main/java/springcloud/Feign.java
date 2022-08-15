package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@SpringBootApplication(scanBasePackages = "sprincloud.service")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"sprincloud.service"})
//@ComponentScan("sprincloud.service")
//@ComponentScans({@ComponentScan("sprincloud.service")})
public class Feign {
    public static void main(String[] args) {
        SpringApplication.run(Feign.class,args) ;
    }
}
