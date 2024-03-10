package org.example.personservice.repository;

import org.example.personservice.model.Address;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AddressRepository extends R2dbcRepository<Address, Long> {
}
