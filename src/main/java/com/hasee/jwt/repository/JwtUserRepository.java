package com.hasee.jwt.repository;

import com.hasee.jwt.model.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtUserRepository extends JpaRepository<JwtUser,Long> {
}
