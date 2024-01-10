package com.ecom.user.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String mobile;
    private String password;
    private String zip;
}
