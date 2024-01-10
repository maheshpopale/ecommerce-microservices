package com.ecom.user.converter;

import com.ecom.user.dto.UserDTO;
import com.ecom.user.model.Users;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDTO {

    public Users convertToUser(UserDTO userDTO){
        Users users =new Users();
        users.setUserId(userDTO.getUserId());
        users.setFirstName(userDTO.getFirstName());
        users.setLastName(userDTO.getLastName());
        users.setEmail(userDTO.getEmail());
        users.setAddress(userDTO.getAddress());
        users.setMobile(userDTO.getMobile());
        users.setPassword(userDTO.getPassword());
        users.setZip(userDTO.getZip());
        return users;
    }

    public UserDTO convertToDTO(Users users){
        UserDTO dto=new UserDTO();
        dto.setUserId(users.getUserId());
        dto.setFirstName(users.getFirstName());
        dto.setLastName(users.getLastName());
        dto.setEmail(users.getEmail());
        dto.setAddress(users.getAddress());
        dto.setMobile(users.getMobile());
        dto.setPassword(users.getPassword());
        dto.setZip(users.getZip());
        return dto;
    }
}
