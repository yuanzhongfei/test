package sprincloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sprincloud.pojo.Account;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
//    private static  final String url = "http://localhost:8001";
    private static  final String url = "http://SPRINGCLOUD-PROVIDER";

    @GetMapping("/consumer/get/{id}")
    private Account get(@PathVariable("id") int id)
    {
        Account account = restTemplate.getForObject(url + "/account/get/" + id, Account.class);
        return account ;
    }



}
