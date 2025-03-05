package com.hgu.hisbooker.user.service;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hgu.hisbooker.user.domain.User;
import com.hgu.hisbooker.user.dto.UserCreateDto;
import com.hgu.hisbooker.user.dto.UserUpdateDto;
import com.hgu.hisbooker.user.repo.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserCreateDto createUser(final UserCreateDto userCreateDto) {
        final User user = User.from(userCreateDto);
        final User savedUser = userRepository.save(user);
        return UserCreateDto.from(savedUser);
    }

    @Override
    @Transactional
    public UserCreateDto updateUser(final UserUpdateDto userUpdateDto) {
        final User user = getUserById(userUpdateDto.getId());
        final User updatedUser = user.update(userUpdateDto);
        return UserCreateDto.from(updatedUser);
    }

    @Override
    public void deleteUser(final UserUpdateDto userUpdateDto) {
        final User user = getUserById(userUpdateDto.getId());
        user.delete();
    }

    private User getUserById(final Long userId) {
        return userRepository
                .findByIdAndDeletedFalse(userId)
                .orElseThrow(() -> new RuntimeException("User Not Fount"));
    }
}
