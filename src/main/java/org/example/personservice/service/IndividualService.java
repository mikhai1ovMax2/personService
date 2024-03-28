package org.example.personservice.service;

import org.example.personservice.mapper.IndividualMapper;
import org.example.personservice.repository.IndividualRepository;
import org.maks.lib.CountryDTO;
import org.maks.lib.IndividualDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class IndividualService {

    private final IndividualRepository individualRepository;
    private final IndividualMapper individualMapper;

    public IndividualService(IndividualRepository individualRepository, IndividualMapper individualMapper) {
        this.individualRepository = individualRepository;
        this.individualMapper = individualMapper;
    }

    public Mono<IndividualDTO> save(IndividualDTO individualDTO){
        individualDTO.setUpdatedAt(LocalDateTime.now());
        individualDTO.setCreatedAt(LocalDateTime.now());
        return individualRepository.save(individualMapper.convert(individualDTO))
                .map(individualMapper::convert);
    }

    public Flux<IndividualDTO> getAll() {
        return individualRepository.findAll()
                .map(individualMapper::convert);

    }

    public Mono<IndividualDTO> getById(UUID id){
        return individualRepository.findById(id)
                .map(individualMapper::convert);
    }

}
