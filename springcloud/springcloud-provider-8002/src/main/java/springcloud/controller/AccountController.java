package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sprincloud.pojo.Account;
import springcloud.service.AccountService;


@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/account/get/{id}")
    @HystrixCommand(fallbackMethod = "Hystrix_get")
    public Account get(@PathVariable("id") int id)
    {
        Account account = accountService.getAccountById(id);
        return account ;
    }

    public  Account Hystrix_get(@PathVariable("id") int id)
    {
        return new Account().setId(id).
                setMoney(100).
                setUsername("没有这个账户，熔断机制Hystrix启动");
    }
}
