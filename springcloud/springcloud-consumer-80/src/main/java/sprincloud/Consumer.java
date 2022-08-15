package sprincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient 自定义负载均衡算法
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}
