package com.easycom.simple_registration_login.service;

import com.easycom.simple_registration_login.dto.UserDto;
import com.easycom.simple_registration_login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
