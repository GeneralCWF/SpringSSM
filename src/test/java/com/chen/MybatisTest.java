package com.chen;


import com.chen.doamin.Account;
import com.chen.mapper.AccountMapper;
import com.chen.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisTest {
    @Autowired
    public AccountMapper accountMapper;

    @Test
    public void test2() throws IOException {
        Account account = accountMapper.findById(10);
        System.out.println(account);
    }

    @Test
    public void test1() throws IOException {

        Account account = new Account(10, "test测试", 12312D, new Date());
        accountMapper.save(account);

    }

}
