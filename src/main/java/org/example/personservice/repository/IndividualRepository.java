package org.example.personservice.repository;

import org.example.personservice.model.Country;
import org.example.personservice.model.Individual;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface IndividualRepository extends R2dbcRepository<Individual, Long> {
}
