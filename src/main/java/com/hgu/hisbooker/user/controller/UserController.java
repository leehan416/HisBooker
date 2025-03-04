package com.hgu.hisbooker.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hgu.hisbooker.user.dto.UserCreateDto;
import com.hgu.hisbooker.user.dto.UserUpdateDto;
import com.hgu.hisbooker.user.dto.requset.ReqUserCreateDto;
import com.hgu.hisbooker.user.dto.requset.ReqUserUpdateDto;
import com.hgu.hisbooker.user.dto.response.ResUserCreateDto;
import com.hgu.hisbooker.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<ResUserCreateDto> createUser(
            @RequestBody ReqUserCreateDto reqUserCreateDto) {
        return ResponseEntity.ok(
                ResUserCreateDto.from(
                        userService.createUser(UserCreateDto.from(reqUserCreateDto))));
    }

    @PutMapping("")
    public ResponseEntity<ResUserCreateDto> updateUser(
            @RequestBody ReqUserUpdateDto reqUserUpdateDto) {
        return ResponseEntity.ok(
                ResUserCreateDto.from(
                        userService.updateUser(UserUpdateDto.from(reqUserUpdateDto))));
    }

    @DeleteMapping("")
    public ResponseEntity<ResUserCreateDto> deleteUser(@RequestBody Long userId) {
        return ResponseEntity.ok(ResUserCreateDto.from(userService.deleteUser(userId)));
    }
}
