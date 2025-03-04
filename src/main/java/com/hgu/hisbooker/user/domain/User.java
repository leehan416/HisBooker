package com.hgu.hisbooker.user.domain;

import jakarta.persistence.Entity;

import com.hgu.hisbooker.comon.domain.BaseEntity;

import lombok.Getter;

@Entity
@Getter
public class User extends BaseEntity {
    private String email;
    private String password;
    private String nickname;
}
