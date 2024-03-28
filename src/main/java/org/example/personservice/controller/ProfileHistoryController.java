package org.example.personservice.controller;

import org.example.personservice.service.MerchantMemberInvitationService;
import org.example.personservice.service.ProfileHistoryService;
import org.maks.lib.MerchantMembersInvitationDTO;
import org.maks.lib.ProfileHistoryDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;


@RestController
@RequestMapping("api/v1/profile_history/")
public class ProfileHistoryController {

    private final ProfileHistoryService profileHistoryService;

    public ProfileHistoryController(ProfileHistoryService profileHistoryService) {
        this.profileHistoryService = profileHistoryService;
    }


    @PostMapping("new_user")
    public Mono<ProfileHistoryDTO> createNewUser(@RequestBody ProfileHistoryDTO profileHistoryDTO){
        return profileHistoryService.save(profileHistoryDTO);
    }

    @GetMapping("/all")
    public Flux<ProfileHistoryDTO> getAll(){
        return profileHistoryService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<ProfileHistoryDTO> getById(@PathVariable("id") String id){
        return profileHistoryService.getById(UUID.fromString(id));
    }
}