package com.entities.dto;

import com.entities.db.UsersVaccines;
import com.enums.DocumentsType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String document;
    private DocumentsType documentType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<UsersVaccines> vaccines;
    private String phone;
    private String nickname;
}
