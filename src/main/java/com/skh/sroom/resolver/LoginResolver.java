package com.skh.sroom.resolver;

import java.util.List;

import com.skh.sroom.repository.LoginRepository;
import com.skh.sroom.vo.Login;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginResolver implements GraphQLQueryResolver {

    @Autowired
    private LoginRepository loginRepository;

    public List<Login> findAllUser() {
        System.out.println(loginRepository.findAll());
        return loginRepository.findAll();
    }

    public long getTotalUserCnt() {
        return loginRepository.count();
    }

    public String hello() {
        return "YES HI";
    }
}