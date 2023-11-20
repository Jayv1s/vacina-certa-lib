package com.entities.dto;

import com.enums.DocumentsType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAccessDTO {
    private String login;
    private DocumentsType documentType;
    private String password;
    private List<String> roles;
    private UsersDTO usersDTO;
}
