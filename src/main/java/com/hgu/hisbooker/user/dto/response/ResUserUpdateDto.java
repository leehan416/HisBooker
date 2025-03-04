package com.hgu.hisbooker.user.dto.response;

import com.hgu.hisbooker.user.dto.UserUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResUserUpdateDto {
    private String email; // username (id)
    private String nickname;

    public static ResUserUpdateDto from(UserUpdateDto userUpdateDto) {
        return builder()
                .email(userUpdateDto.getEmail())
                .nickname(userUpdateDto.getNickname())
                .build();
    }
}
