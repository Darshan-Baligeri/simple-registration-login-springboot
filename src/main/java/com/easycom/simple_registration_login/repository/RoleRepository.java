package com.easycom.simple_registration_login.repository;

import com.easycom.simple_registration_login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
