package org.example.personservice.controller;

import org.example.personservice.service.MerchantMembersService;
import org.example.personservice.service.MerchantService;
import org.maks.lib.MerchantDTO;
import org.maks.lib.MerchantMembersDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;



@RestController
@RequestMapping("api/v1/merchant_members/")
public class MerchantMembersController {

    private final MerchantMembersService merchantMembersService;

    public MerchantMembersController(MerchantMembersService merchantMembersService) {
        this.merchantMembersService = merchantMembersService;
    }


    @PostMapping("new_user")
    public Mono<MerchantMembersDTO> createNewUser(@RequestBody MerchantMembersDTO merchantMembersDTO){
        return merchantMembersService.save(merchantMembersDTO);
    }

    @GetMapping("/all")
    public Flux<MerchantMembersDTO> getAll(){
        return merchantMembersService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<MerchantMembersDTO> getById(@PathVariable("id") String id){
        return merchantMembersService.getById(UUID.fromString(id));
    }
}