package com.chen.service;


import com.chen.doamin.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();

}
