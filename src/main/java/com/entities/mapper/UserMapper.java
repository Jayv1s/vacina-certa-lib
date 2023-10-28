package com.entities.mapper;

import com.entities.db.User;
import com.entities.dto.UsersDTO;
import com.enums.DocumentsType;

public class UserMapper {
    public static UsersDTO convertToUsersDTO(User user) {
        return UsersDTO.builder()
                .id(user.getId())
                .createdAt(user.getCreatedAt())
                .dateOfBirth(user.getDateOfBirth())
                .document(user.getDocument())
                .documentType(DocumentsType.valueOf(user.getDocumentType()))
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .updatedAt(user.getUpdatedAt())
                .build();
    }

    public static User convertToUserDB(UsersDTO user) {
        return User.builder()
                .id(user.getId())
                .createdAt(user.getCreatedAt())
                .dateOfBirth(user.getDateOfBirth())
                .document(user.getDocument())
                .documentType(user.getDocumentType().name())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
}
