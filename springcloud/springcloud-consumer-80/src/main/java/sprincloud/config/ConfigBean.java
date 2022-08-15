package sprincloud.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    // 策略 IRule　
    // 负载平衡实现RestTemplate
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
//    @Bean
//    public IRule iRule()
//    {
//        return new RandomRule();
//        return new RetryRule();
//        return new AvailabilityFilteringRule();
//        return new BestAvailableRule();
//    }

}
