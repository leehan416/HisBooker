package com.hgu.hisbooker.user.service;

import org.springframework.stereotype.Service;

import com.hgu.hisbooker.user.dto.UserCreateDto;
import com.hgu.hisbooker.user.dto.UserUpdateDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public UserCreateDto createUser(UserCreateDto UserCreateDto) {
        return null;
    }

    @Override
    public UserCreateDto updateUser(UserUpdateDto UserUpdateDto) {
        return null;
    }

    @Override
    public UserCreateDto deleteUser(Long userId) {
        return null;
    }
}
