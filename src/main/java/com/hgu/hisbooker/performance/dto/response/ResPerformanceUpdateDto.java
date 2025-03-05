package com.hgu.hisbooker.performance.dto.response;

import java.time.LocalDateTime;

import com.hgu.hisbooker.performance.dto.PerformanceUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ResPerformanceUpdateDto {
    private Long id;
    private String title;
    private String writerUsername;
    private String content;
    private String posterImg;
    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ResPerformanceUpdateDto from(final PerformanceUpdateDto performanceUpdateDto) {
        return builder()
                .id(performanceUpdateDto.getId())
                .writerUsername(performanceUpdateDto.getWriterUsername())
                .title(performanceUpdateDto.getTitle())
                .content(performanceUpdateDto.getContent())
                .posterImg(performanceUpdateDto.getPosterImg())
                .performanceStartAt(performanceUpdateDto.getPerformanceStartAt())
                .performanceEndAt(performanceUpdateDto.getPerformanceEndAt())
                .createdAt(performanceUpdateDto.getCreatedAt())
                .updatedAt(performanceUpdateDto.getUpdatedAt())
                .build();
    }
}
