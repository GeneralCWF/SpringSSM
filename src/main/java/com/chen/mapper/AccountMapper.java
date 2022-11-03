package com.chen.mapper;

import com.chen.doamin.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

    public Account findById(int id);

}
