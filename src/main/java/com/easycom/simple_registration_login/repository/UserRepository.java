package com.easycom.simple_registration_login.repository;

import com.easycom.simple_registration_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
