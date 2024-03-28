package org.example.personservice.service;

import org.example.personservice.mapper.MerchantMapper;
import org.example.personservice.mapper.MerchantMembersMapper;
import org.example.personservice.mapper.VerificationStatusMapper;
import org.example.personservice.repository.MerchantRepository;
import org.example.personservice.repository.VerificationStatusRepository;
import org.maks.lib.MerchantDTO;
import org.maks.lib.VerificationStatusDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class MerchantService {

    private final MerchantRepository merchantRepository;
    private final MerchantMapper merchantMapper;

    public MerchantService(MerchantRepository merchantRepository, MerchantMapper merchantMapper) {
        this.merchantRepository = merchantRepository;
        this.merchantMapper = merchantMapper;
    }


    public Mono<MerchantDTO> save(MerchantDTO merchantDTO){
        merchantDTO.setUpdatedAt(LocalDateTime.now());
        merchantDTO.setCreatedAt(LocalDateTime.now());
        return merchantRepository.save(merchantMapper.convert(merchantDTO))
                .map(merchantMapper::convert);
    }


    public Mono<MerchantDTO> getById(UUID uuid) {
        return merchantRepository.findById(uuid)
                .map(merchantMapper::convert);
    }

    public Flux<MerchantDTO> getAll() {
        return merchantRepository.findAll()
                .map(merchantMapper::convert);

    }
}
