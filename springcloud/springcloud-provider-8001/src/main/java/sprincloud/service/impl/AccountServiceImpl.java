package sprincloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprincloud.pojo.Account;
import sprincloud.mapper.AccountMapper;
import sprincloud.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public Account getAccountById(int id) {
        Account account = accountMapper.getAccountById(id);
        return account;
    }
}
