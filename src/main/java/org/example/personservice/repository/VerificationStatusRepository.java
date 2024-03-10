package org.example.personservice.repository;

import org.example.personservice.model.User;
import org.example.personservice.model.VerificationStatus;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface VerificationStatusRepository extends R2dbcRepository<VerificationStatus, Long> {
}
