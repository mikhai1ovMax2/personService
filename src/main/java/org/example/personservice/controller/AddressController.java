package org.example.personservice.controller;

import org.example.personservice.service.AddessService;
import org.maks.lib.AddressDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {

    private final AddessService addessService;

    public AddressController(AddessService addessService) {
        this.addessService = addessService;
    }

    @PostMapping("/new_address")
    public Mono<AddressDTO> saveAddress(@RequestBody AddressDTO addressDTO){
        return addessService.saveAddress(addressDTO);
    }


    @GetMapping("/all")
    public Flux<AddressDTO> getAll(){
        return addessService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<AddressDTO> getById(@PathVariable("id") String id){
        return addessService.getById(UUID.fromString(id));
    }
}
