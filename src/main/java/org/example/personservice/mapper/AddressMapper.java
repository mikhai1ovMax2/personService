package org.example.personservice.mapper;

import org.example.personservice.model.Address;
import org.maks.lib.AddressDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO convert(Address merchant);

    Address convert(AddressDTO dto);

}
