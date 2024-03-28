package org.example.personservice.mapper;

import org.example.personservice.model.Individual;
import org.maks.lib.IndividualDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IndividualMapper {

    IndividualDTO convert(Individual individual);

    Individual convert(IndividualDTO individualDTO);

}
