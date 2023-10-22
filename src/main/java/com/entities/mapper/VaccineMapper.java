package com.entities.mapper;

import com.entities.db.Vaccine;
import com.entities.dto.VaccineDTO;

public class VaccineMapper {
    public static VaccineDTO convertToVaccineDTO(Vaccine vaccine) {
        return VaccineDTO.builder()
//                .vaccines(vaccine.getVaccines())
                .age(vaccine.getAge())
                .year(vaccine.getYear())
                .createdAt(vaccine.getCreatedAt())
                .fullName(vaccine.getFullName())
                .id(vaccine.getId())
                .manufacturer(vaccine.getManufacturer())
                .popularName(vaccine.getPopularName())
                .updatedAt(vaccine.getUpdatedAt())
                .build();
    }

    public static Vaccine convertToVaccineDB(VaccineDTO vaccineDTO) {
        return Vaccine.builder()
//                .vaccines(vaccineDTO.getVaccines())
                .age(vaccineDTO.getAge())
                .year(vaccineDTO.getYear())
                .createdAt(vaccineDTO.getCreatedAt())
                .fullName(vaccineDTO.getFullName())
                .id(vaccineDTO.getId())
                .manufacturer(vaccineDTO.getManufacturer())
                .popularName(vaccineDTO.getPopularName())
                .updatedAt(vaccineDTO.getUpdatedAt())
                .build();
    }
}
