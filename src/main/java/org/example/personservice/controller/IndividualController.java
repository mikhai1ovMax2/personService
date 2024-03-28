package org.example.personservice.controller;

import org.example.personservice.service.CountryService;
import org.example.personservice.service.IndividualService;
import org.maks.lib.CountryDTO;
import org.maks.lib.IndividualDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;


@RestController
@RequestMapping("api/v1/individuals/")
public class IndividualController {

    private final IndividualService individualService;

    public IndividualController(IndividualService individualService) {
        this.individualService = individualService;
    }


    @PostMapping("new_user")
    public Mono<IndividualDTO> createNewUser(@RequestBody IndividualDTO individualDTO){
        return individualService.save(individualDTO);
    }

    @GetMapping("/all")
    public Flux<IndividualDTO> getAll(){
        return individualService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<IndividualDTO> getById(@PathVariable("id") String id){
        return individualService.getById(UUID.fromString(id));
    }
}