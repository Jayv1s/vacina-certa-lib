package com.entities.mapper;

import com.entities.db.UserAccess;
import com.entities.dto.UserAccessDTO;

import java.util.Arrays;

public class UserAccessMapper {
    public static UserAccessDTO convertUserAccessDTO(UserAccess userAccess) {
        return UserAccessDTO.builder()
                .login(userAccess.getLogin())
                .password(userAccess.getPassword())
                .roles(Arrays.asList(userAccess.getRoles().split(",")))
                .usersDTO(UserMapper.convertToUsersDTO(userAccess.getUser()))
                .build();
    }

    public static UserAccess convertUserAccessDB(UserAccessDTO userAccessDTO) {
        return UserAccess.builder()
                .login(userAccessDTO.getLogin())
                .password(userAccessDTO.getPassword())
                .roles(String.join(",", userAccessDTO.getRoles()))
                .user(UserMapper.convertToUserDB(userAccessDTO.getUsersDTO()))
                .build();
    }
}
