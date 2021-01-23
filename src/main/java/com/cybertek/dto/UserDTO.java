package com.cybertek.dto;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private String confirmedPassword;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;
}