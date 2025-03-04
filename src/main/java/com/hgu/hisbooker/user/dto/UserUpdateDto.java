package com.hgu.hisbooker.user.dto;

import com.hgu.hisbooker.user.dto.requset.ReqUserUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserUpdateDto {
    private Long id;
    private String email; // username (id)
    private String nickname;

    public static UserUpdateDto from(ReqUserUpdateDto reqUserUpdateDto) {
        return builder()
                .email(reqUserUpdateDto.getEmail())
                .nickname(reqUserUpdateDto.getNickname())
                .build();
    }
}
