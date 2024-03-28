package org.example.personservice.service;

import org.example.personservice.mapper.ProfileHistoryMapper;
import org.example.personservice.repository.ProfileHistoryRepository;
import org.maks.lib.MerchantDTO;
import org.maks.lib.ProfileHistoryDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public record ProfileHistoryService(ProfileHistoryRepository profileHistoryRepository,
                                    ProfileHistoryMapper profileHistoryMapper) {


    public Mono<ProfileHistoryDTO> save(ProfileHistoryDTO profileHistoryDTO){
        profileHistoryDTO.setCreatedAt(LocalDateTime.now());
        return profileHistoryRepository.save(profileHistoryMapper.convert(profileHistoryDTO))
                .map(profileHistoryMapper::convert);
    }


    public Mono<ProfileHistoryDTO> getById(UUID uuid) {
        return profileHistoryRepository.findById(uuid)
                .map(profileHistoryMapper::convert);
    }

    public Flux<ProfileHistoryDTO> getAll() {
        return profileHistoryRepository.findAll()
                .map(profileHistoryMapper::convert);

    }

}
