package org.example.personservice.controller;

import org.example.personservice.service.UserService;
import org.maks.lib.AddressDTO;
import org.maks.lib.UserDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/users/")
public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("new_user")
    public Mono<UserDTO> createNewUser(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @GetMapping("all")
    public Flux<UserDTO> getAll(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public Mono<UserDTO> getById(@PathVariable("id") String id){
        return userService.getById(UUID.fromString(id));
    }
}
