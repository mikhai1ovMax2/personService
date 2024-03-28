package org.example.personservice.mapper;

import org.example.personservice.model.User;
import org.maks.lib.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO convert(User merchant);
    User convert(UserDTO dto);

}


