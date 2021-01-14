package com.skh.sroom.resolver;

import java.util.List;

import com.skh.sroom.repository.LoginRepository;
import com.skh.sroom.vo.Login;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LoginResolver implements GraphQLQueryResolver {

    @Autowired
    private LoginRepository loginRepository;

    public List<Login> user() {
        System.out.println("res");
        return loginRepository.findAll();
    }

    public String hello() {
        return "YES HI";
    }
}