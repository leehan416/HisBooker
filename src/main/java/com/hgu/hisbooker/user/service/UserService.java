package com.hgu.hisbooker.user.service;

import org.springframework.stereotype.Service;

import com.hgu.hisbooker.user.dto.UserCreateDto;
import com.hgu.hisbooker.user.dto.UserUpdateDto;

@Service
public interface UserService {

    UserCreateDto createUser(UserCreateDto UserCreateDto);

    UserCreateDto updateUser(UserUpdateDto UserUpdateDto);

    void deleteUser(UserUpdateDto UserUpdateDto);
}
