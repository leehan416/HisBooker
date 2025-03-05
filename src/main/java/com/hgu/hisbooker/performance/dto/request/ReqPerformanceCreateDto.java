package com.hgu.hisbooker.performance.dto.request;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ReqPerformanceCreateDto {
    private String title;
    private String content;
    private String posterImg;
    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;
}
