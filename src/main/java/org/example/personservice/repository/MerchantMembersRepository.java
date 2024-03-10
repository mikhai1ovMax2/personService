package org.example.personservice.repository;

import org.example.personservice.model.Merchant;
import org.example.personservice.model.MerchantMembers;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface MerchantMembersRepository extends R2dbcRepository<MerchantMembers, Long>{


}
