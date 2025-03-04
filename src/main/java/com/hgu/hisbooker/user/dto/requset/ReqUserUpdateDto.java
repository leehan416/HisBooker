package com.hgu.hisbooker.user.dto.requset;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ReqUserUpdateDto {
    private String email; // username (id)
    private String nickname;
}
