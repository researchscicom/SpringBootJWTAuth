package com.techprimers.security.jwtsecurity.controller;

import com.techprimers.security.jwtsecurity.model.JwtUser;
import com.techprimers.security.jwtsecurity.repository.JwtUserRepository;
import com.techprimers.security.jwtsecurity.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {


    @Autowired
    JwtUserRepository jwtUserRepository;

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        String token = jwtGenerator.generate(jwtUser);
        jwtUser.setToken(token);
        jwtUserRepository.save(jwtUser);
        return token;
    }
}