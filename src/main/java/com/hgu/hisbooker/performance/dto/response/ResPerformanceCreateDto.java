package com.hgu.hisbooker.performance.dto.response;

import java.time.LocalDateTime;

import com.hgu.hisbooker.performance.dto.PerformanceCreateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResPerformanceCreateDto {
    private Long id;
    private String title;
    private String writerUsername;
    private String content;
    private String posterImg;
    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ResPerformanceCreateDto from(final PerformanceCreateDto performanceCreateDto) {
        return builder()
                .id(performanceCreateDto.getId())
                .writerUsername(performanceCreateDto.getWriterUsername())
                .title(performanceCreateDto.getTitle())
                .content(performanceCreateDto.getContent())
                .posterImg(performanceCreateDto.getPosterImg())
                .performanceStartAt(performanceCreateDto.getPerformanceStartAt())
                .performanceEndAt(performanceCreateDto.getPerformanceEndAt())
                .createdAt(performanceCreateDto.getCreatedAt())
                .updatedAt(performanceCreateDto.getUpdatedAt())
                .build();
    }
}
