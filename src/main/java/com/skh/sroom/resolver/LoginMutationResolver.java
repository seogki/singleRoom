package com.skh.sroom.resolver;

import com.skh.sroom.repository.LoginRepository;
import com.skh.sroom.vo.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class LoginMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private LoginRepository loginRepository;

    public boolean saveUserInfo(Login login) {
        loginRepository.save(login);

        return true;
    }
}