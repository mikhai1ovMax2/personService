package org.example.personservice.mapper;

import org.example.personservice.model.VerificationStatus;
import org.maks.lib.VerificationStatusDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface VerificationStatusMapper {

    VerificationStatusDTO convert(VerificationStatus verificationStatus);
    VerificationStatus convert(VerificationStatusDTO verificationStatusDTO);
}
