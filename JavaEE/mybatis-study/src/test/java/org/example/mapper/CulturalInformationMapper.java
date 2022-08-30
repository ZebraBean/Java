package org.example.mapper;

import org.example.model.CulturalInformation;

public interface CulturalInformationMapper {
    int insert(CulturalInformation record);

    int insertSelective(CulturalInformation record);
}