package com.hgu.hisbooker.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import com.hgu.hisbooker.comon.domain.BaseEntity;
import com.hgu.hisbooker.user.dto.UserCreateDto;
import com.hgu.hisbooker.user.dto.UserUpdateDto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    public static User from(final UserCreateDto userCreateDto) {
        return builder()
                .nickname(userCreateDto.getNickname())
                .email(userCreateDto.getEmail())
                .password(userCreateDto.getPassword())
                .build();
    }

    public User update(UserUpdateDto userUpdateDto) {
        this.email = userUpdateDto.getEmail();
        this.nickname = userUpdateDto.getNickname();
        return this;
    }
}
