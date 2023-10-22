package com.entities.mapper;

import com.entities.db.UsersVaccines;
import com.entities.dto.UsersVaccinesDTO;

public class UsersVaccinesMapper {
    public static UsersVaccinesDTO convertToUsersVaccinesDTO(UsersVaccines usersVaccines) {
        return UsersVaccinesDTO.builder()
                .vaccine(usersVaccines.getVaccine())
                .user(usersVaccines.getUser())
                .vaccine(usersVaccines.getVaccine())
                .id(usersVaccines.getId())
                .build();
    }

    public static UsersVaccines convertToUsersVaccines(UsersVaccinesDTO usersVaccinesDTO) {
        return UsersVaccines.builder()
                .vaccine(usersVaccinesDTO.getVaccine())
                .user(usersVaccinesDTO.getUser())
                .vaccine(usersVaccinesDTO.getVaccine())
                .id(usersVaccinesDTO.getId())
                .build();
    }
}
