package org.example.personservice.repository;

import org.example.personservice.model.MerchantMembersInvitation;
import org.example.personservice.model.ProfileHistory;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface ProfileHistoryRepository extends R2dbcRepository<ProfileHistory, UUID> {
}
