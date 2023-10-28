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
    public String id;
    public String firstName;
    public String lastName;
    public LocalDateTime dateOfBirth;
    public String document;
    public DocumentsType documentType;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    private Set<UsersVaccines> vaccines;
}
