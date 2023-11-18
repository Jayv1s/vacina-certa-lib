package com.entities.mapper;

import com.entities.db.UserAccess;
import com.entities.dto.UserAccessDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class UserAccessMapper {
    public static UserAccessDTO convertToDTO(UserAccess userAccess) {
        return UserAccessDTO.builder()
                .login(userAccess.getLogin())
                .password(userAccess.getPassword())
                .roles(new ArrayList<>(Arrays.asList(userAccess.getRoles().split(","))))
                .usersDTO(UserMapper.convertToUsersDTO(userAccess.getUser()))
                .build();
    }

    public static UserAccess convertToDB(UserAccessDTO userAccessDTO) {
        return UserAccess.builder()
                .login(userAccessDTO.getLogin())
                .password(userAccessDTO.getPassword())
                .roles(StringUtils.join(userAccessDTO.getRoles()))
                .user(UserMapper.convertToUserDB(userAccessDTO.getUsersDTO()))
                .build();
    }
}
