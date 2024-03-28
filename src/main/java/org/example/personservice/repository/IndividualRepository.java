package org.example.personservice.repository;

import org.example.personservice.model.Country;
import org.example.personservice.model.Individual;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface IndividualRepository extends R2dbcRepository<Individual, UUID> {
}
