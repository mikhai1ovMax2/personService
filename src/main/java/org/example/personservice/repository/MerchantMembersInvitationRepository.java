package org.example.personservice.repository;

import org.example.personservice.model.MerchantMembers;
import org.example.personservice.model.MerchantMembersInvitation;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface MerchantMembersInvitationRepository extends R2dbcRepository<MerchantMembersInvitation, UUID> {
}
