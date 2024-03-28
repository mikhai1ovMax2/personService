package org.example.personservice.mapper;

import org.example.personservice.model.MerchantMembersInvitation;
import org.maks.lib.MerchantMembersInvitationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MerchantMembersInvitationMapper {

    MerchantMembersInvitationDTO convert(MerchantMembersInvitation merchantMembersInvitation);

    MerchantMembersInvitation convert(MerchantMembersInvitationDTO merchantMembersInvitationDTO);

}
