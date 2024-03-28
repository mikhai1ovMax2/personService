package org.example.personservice.mapper;

import org.example.personservice.model.Country;
import org.maks.lib.CountryDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDTO convert(Country merchant);
    Country convert(CountryDTO dto);

}

