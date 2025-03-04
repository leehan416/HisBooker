package com.hgu.hisbooker.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgu.hisbooker.user.domain.User;

public interface UserRepository extends JpaRepository<Long, User> {}
