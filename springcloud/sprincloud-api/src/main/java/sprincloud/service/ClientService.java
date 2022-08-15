package sprincloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sprincloud.pojo.Account;
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER",fallbackFactory = ClientServiceFallBackFactory.class)
public interface ClientService {
    @GetMapping("/account/get/{id}")
    public Account queryById(@PathVariable("id") int id);
}
