package org.example.personservice.mapper;

import org.example.personservice.model.ProfileHistory;
import org.maks.lib.ProfileHistoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileHistoryMapper {

    ProfileHistoryDTO convert(ProfileHistory profileHistory);

    ProfileHistory convert(ProfileHistoryDTO profileHistoryDTO);
}