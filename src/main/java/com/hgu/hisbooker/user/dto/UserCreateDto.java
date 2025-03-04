package com.hgu.hisbooker.user.dto;

import com.hgu.hisbooker.user.domain.User;
import com.hgu.hisbooker.user.dto.requset.ReqUserCreateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UserCreateDto {
    private Long id;
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

    public static UserCreateDto from(User user) {
        return builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .nickname(user.getNickname())
                .build();
    }
}
