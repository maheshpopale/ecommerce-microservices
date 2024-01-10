package com.ecom.user.service;

import com.ecom.user.converter.UserToUserDTO;
import com.ecom.user.dto.UserDTO;
import com.ecom.user.model.Users;
import com.ecom.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserToUserDTO converter;

    @Override
    public UserDTO saveUser(UserDTO user) {
        Users users1 = converter.convertToUser(user);
        if (users1 != null) {
            return converter.convertToDTO(userRepository.save(users1));
        } else return null;
    }


    @Override
    public List<UserDTO> findAll() {
        List<Users> users = userRepository.findAll();
        List<UserDTO> usersList = new ArrayList<>();
        users.forEach(user -> {
            usersList.add(converter.convertToDTO(user));
        });
        return usersList;
    }

    @Override
    public UserDTO findById(long userId) {
        Users users = userRepository.findById(userId).get();
        return converter.convertToDTO(users);
    }

    @Override
    public boolean deleteUser(long userId) {
        Users users = userRepository.findById(userId).get();
        if (users != null) {
            userRepository.delete(users);
            return true;
        } else return false;
    }
}
