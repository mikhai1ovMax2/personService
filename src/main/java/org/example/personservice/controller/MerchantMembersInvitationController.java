package org.example.personservice.controller;

import org.example.personservice.model.MerchantMembersInvitation;
import org.example.personservice.service.MerchantMemberInvitationService;
import org.example.personservice.service.MerchantMembersService;
import org.maks.lib.MerchantMembersDTO;
import org.maks.lib.MerchantMembersInvitationDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;


@RestController
@RequestMapping("api/v1/merchant_member_invitations/")
public class MerchantMembersInvitationController {

    private final MerchantMemberInvitationService merchantMemberInvitationService;

    public MerchantMembersInvitationController(MerchantMemberInvitationService merchantMemberInvitationService) {
        this.merchantMemberInvitationService = merchantMemberInvitationService;
    }


    @PostMapping("new_user")
    public Mono<MerchantMembersInvitationDTO> createNewUser(@RequestBody MerchantMembersInvitationDTO merchantMembersInvitationDTO){
        return merchantMemberInvitationService.save(merchantMembersInvitationDTO);
    }

    @GetMapping("/all")
    public Flux<MerchantMembersInvitationDTO> getAll(){
        return merchantMemberInvitationService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<MerchantMembersInvitationDTO> getById(@PathVariable("id") String id){
        return merchantMemberInvitationService.getById(UUID.fromString(id));
    }
}