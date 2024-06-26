package org.example.personservice.repository;

import org.example.personservice.model.Individual;
import org.example.personservice.model.Merchant;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface MerchantRepository extends R2dbcRepository<Merchant, UUID> {
}
