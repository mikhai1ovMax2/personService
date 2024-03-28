package org.example.personservice.service;

import org.example.personservice.mapper.VerificationStatusMapper;
import org.example.personservice.repository.VerificationStatusRepository;
import org.maks.lib.MerchantMembersDTO;
import org.maks.lib.VerificationStatusDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class VerificationStatusService {

    private final VerificationStatusRepository verificationStatusRepository;
    private final VerificationStatusMapper verificationStatusMapper;

    public VerificationStatusService(VerificationStatusRepository verificationStatusRepository, VerificationStatusMapper verificationStatusMapper) {
        this.verificationStatusRepository = verificationStatusRepository;
        this.verificationStatusMapper = verificationStatusMapper;
    }


    public Mono<VerificationStatusDTO> save(VerificationStatusDTO verificationStatusDTO){
        verificationStatusDTO.setUpdatedAt(LocalDateTime.now());
        verificationStatusDTO.setCreatedAt(LocalDateTime.now());
        return verificationStatusRepository.save(verificationStatusMapper.convert(verificationStatusDTO))
                .map(verificationStatusMapper::convert);
    }


    public Mono<VerificationStatusDTO> getById(UUID uuid) {
        return verificationStatusRepository.findById(uuid)
                .map(verificationStatusMapper::convert);
    }

    public Mono<VerificationStatusDTO> update(VerificationStatusDTO verificationStatusDTO) {
        verificationStatusDTO.setUpdatedAt(LocalDateTime.now());
        return verificationStatusRepository.save(verificationStatusMapper.convert(verificationStatusDTO))
                .map(verificationStatusMapper::convert);
    }

    public Flux<VerificationStatusDTO> getAll() {
        return verificationStatusRepository.findAll()
                .map(verificationStatusMapper::convert);

    }
}
