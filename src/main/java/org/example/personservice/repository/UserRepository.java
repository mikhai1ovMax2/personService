package org.example.personservice.repository;

import org.example.personservice.model.ProfileHistory;
import org.example.personservice.model.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface UserRepository extends R2dbcRepository<User, UUID> {
}
