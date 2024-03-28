package org.example.personservice.mapper;

import org.example.personservice.model.Merchant;
import org.maks.lib.MerchantDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MerchantMapper {

    MerchantDTO convert(Merchant merchant);

    Merchant convert(MerchantDTO merchantDTO);
}