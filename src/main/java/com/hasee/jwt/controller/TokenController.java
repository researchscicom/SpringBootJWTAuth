package com.hasee.jwt.controller;

import com.hasee.jwt.model.JwtUser;
import com.hasee.jwt.repository.JwtUserRepository;
import com.hasee.jwt.security.JwtGenerator;
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
    public String saveUserAndGenerateToken(@RequestBody final JwtUser jwtUser) {

        String token = jwtGenerator.generate(jwtUser);
        jwtUser.setToken(token);
        jwtUserRepository.save(jwtUser);
        return token;
    }
}
