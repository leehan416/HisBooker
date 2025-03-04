package com.hgu.hisbooker.user.dto;

import com.hgu.hisbooker.user.dto.requset.ReqUserCreateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UserCreateDto {
    private String email; // username (id)
    private String password;
    private String nickname;

    public static UserCreateDto from(ReqUserCreateDto reqUserCreateDto) {
        return builder()
                .email(reqUserCreateDto.getEmail())
                .password(reqUserCreateDto.getPassword())
                .nickname(reqUserCreateDto.getNickname())
                .build();
    }
}
