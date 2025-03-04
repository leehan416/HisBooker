package com.hgu.hisbooker.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgu.hisbooker.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findAllByIdAndDeletedFalse(Long userId);
}
