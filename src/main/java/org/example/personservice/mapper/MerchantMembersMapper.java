package org.example.personservice.mapper;

import org.example.personservice.model.MerchantMembers;
import org.maks.lib.MerchantMembersDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MerchantMembersMapper {

    MerchantMembersDTO convert(MerchantMembers merchantMembers);

    MerchantMembers convert(MerchantMembersDTO merchantMembersDTO);
}
