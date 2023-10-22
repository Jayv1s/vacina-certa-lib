package com.entities.dto;

import com.entities.db.User;
import com.entities.db.Vaccine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersVaccinesDTO {
    public String id;
    private User user;
    private Vaccine vaccine;
}
