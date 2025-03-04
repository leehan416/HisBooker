package com.hgu.hisbooker.user.dto.response;

import com.hgu.hisbooker.user.dto.UserCreateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResUserCreateDto {
    private String email; // username (id)
    private String password;
    private String nickname;

    public static ResUserCreateDto from(UserCreateDto userCreateDto) {
        return builder()
                .email(userCreateDto.getEmail())
                .password(userCreateDto.getPassword())
                .nickname(userCreateDto.getNickname())
                .build();
    }
}
