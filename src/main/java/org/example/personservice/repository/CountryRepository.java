package org.example.personservice.repository;

import org.example.personservice.model.Country;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CountryRepository extends R2dbcRepository<Country, Long> {
}
