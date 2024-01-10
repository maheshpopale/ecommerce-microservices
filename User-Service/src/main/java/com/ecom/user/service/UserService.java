package com.ecom.user.service;

import com.ecom.user.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO user);

    List<UserDTO> findAll();

    UserDTO findById(long userId);

    boolean deleteUser(long userId);
}
