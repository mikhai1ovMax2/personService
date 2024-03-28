package org.example.personservice.service;

import org.example.personservice.mapper.AddressMapper;
import org.example.personservice.repository.AddressRepository;
import org.maks.lib.AddressDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AddessService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    org.maks.lib.AddressDTO addressDTO;

    public AddessService(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }


    public Mono<AddressDTO> saveAddress(AddressDTO addressDTO){
        addressDTO.setUpdatedAt(LocalDateTime.now());
        addressDTO.setCreatedAt(LocalDateTime.now());
        return addressRepository.save(addressMapper.convert(addressDTO))
                .map(addressMapper::convert);
    }

    public Flux<AddressDTO> getAll() {
        return addressRepository.findAll()
                .map(addressMapper::convert);

    }

public Mono<AddressDTO> getById(UUID id){
        return addressRepository.findById(id)
                .map(addressMapper::convert);
    }
}
