package org.example.personservice.service;

import org.example.personservice.mapper.UserMapper;
import org.example.personservice.repository.UserRepository;
import org.maks.lib.MerchantMembersDTO;
import org.maks.lib.UserDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public record UserService(UserRepository userRepository,
                          UserMapper userMapper) {


    public Mono<UserDTO> save(UserDTO userDTO){
        userDTO.setUpdatedAt(LocalDateTime.now());
        userDTO.setCreatedAt(LocalDateTime.now());
        return userRepository.save(userMapper.convert(userDTO))
                .map(userMapper::convert);
    }

    public Flux<UserDTO> getAll() {
        return userRepository.findAll()
                .map(userMapper::convert);

    }

    public Mono<UserDTO> getById(UUID id){
        return userRepository.findById(id)
                .map(userMapper::convert);
    }
}
