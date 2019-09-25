package com.techprimers.security.jwtsecurity.repository;

import com.techprimers.security.jwtsecurity.model.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtUserRepository extends JpaRepository<JwtUser,Long> {
}
