package com.entities.mapper;

import antlr.StringUtils;
import com.entities.db.UserAccess;
import com.entities.dto.UserAccessDTO;
import com.enums.DocumentsType;

import java.util.Arrays;

public class UserAccessMapper {
    public static UserAccessDTO convertUserAccessDTO(UserAccess userAccess) {
        String[] loginSplitted = userAccess.getLogin().split("-");

        return UserAccessDTO.builder()
                .login(loginSplitted[0])
                .documentType(DocumentsType.valueOf(loginSplitted[1]))
                .password(userAccess.getPassword())
                .roles(Arrays.asList(userAccess.getRoles().split(",")))
                .usersDTO(UserMapper.convertToUsersDTO(userAccess.getUser()))
                .build();
    }

    public static UserAccess convertUserAccessDB(UserAccessDTO userAccessDTO) {
        return UserAccess.builder()
                .login(userAccessDTO.getLogin() + "-" + userAccessDTO.getDocumentType().name())
                .password(userAccessDTO.getPassword())
                .roles(String.join(",", userAccessDTO.getRoles()))
                .user(UserMapper.convertToUserDB(userAccessDTO.getUsersDTO()))
                .build();
    }
}
