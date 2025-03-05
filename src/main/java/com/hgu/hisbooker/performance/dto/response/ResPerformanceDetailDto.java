package com.hgu.hisbooker.performance.dto.response;

import java.time.LocalDateTime;

import com.hgu.hisbooker.performance.dto.PerformanceDetailDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResPerformanceDetailDto {
    private Long id;
    private String title;
    private String writerUsername;
    private String content;
    private String posterImg;
    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ResPerformanceDetailDto from(final PerformanceDetailDto performanceDetailDto) {
        return builder()
                .id(performanceDetailDto.getId())
                .writerUsername(performanceDetailDto.getWriterUsername())
                .title(performanceDetailDto.getTitle())
                .content(performanceDetailDto.getContent())
                .posterImg(performanceDetailDto.getPosterImg())
                .performanceStartAt(performanceDetailDto.getPerformanceStartAt())
                .performanceEndAt(performanceDetailDto.getPerformanceEndAt())
                .createdAt(performanceDetailDto.getCreatedAt())
                .updatedAt(performanceDetailDto.getUpdatedAt())
                .build();
    }
}
