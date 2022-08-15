package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sprincloud.pojo.Account;
import sprincloud.service.ClientService;

@RestController
public class ConsumerController {


    @Autowired
    public ClientService clientService  ;
    @GetMapping("/consumer/get/{id}")
    public Account get_feign(@PathVariable("id") int id)
    {
        Account account = clientService.queryById(id);
        return account;
    }
    @GetMapping("/account/get/{id}")
    public Account get(@PathVariable("id") int id)
    {
        Account account = clientService.queryById(id);
        return account;
    }
}
