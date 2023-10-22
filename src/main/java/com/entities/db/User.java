package com.entities.db;

import com.enums.DocumentsType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length=32)
    public String id;

    @Column(name = "primeiro_nome", length = 50)
    public String firstName;

    @Column(name = "ultimo_nome", length = 50)
    public String lastName;

    @Column(name = "data_nascimento", length = 10)
    public String dateOfBirth;

    @Column(name = "documento", length = 30)
    public String document;

    @Column(name = "tipo_documento")
    public Enum<DocumentsType> documentType;

    @Column(name = "criado_em")
    public LocalDateTime createdAt;

    @Column(name = "atualizado_em")
    public LocalDateTime updatedAt;
}
