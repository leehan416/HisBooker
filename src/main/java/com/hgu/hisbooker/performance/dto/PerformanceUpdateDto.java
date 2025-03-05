package com.hgu.hisbooker.performance.dto;

import java.time.LocalDateTime;

import com.hgu.hisbooker.performance.domain.Performance;
import com.hgu.hisbooker.performance.dto.request.ReqPerformanceUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PerformanceUpdateDto {
    private Long id;
    private Long writerId;
    private String writerUsername;
    private String title;
    private String content;
    private String posterImg;
    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static PerformanceUpdateDto from(final Performance performance) {
        return builder()
                .id(performance.getId())
                .writerId(performance.getWriter().getId())
                .writerUsername(performance.getWriter().getNickname())
                .title(performance.getTitle())
                .content(performance.getContent())
                .posterImg(performance.getPosterImg())
                .performanceStartAt(performance.getPerformanceStartAt())
                .performanceEndAt(performance.getPerformanceEndAt())
                .createdAt(performance.getCreatedAt())
                .updatedAt(performance.getUpdatedAt())
                .build();
    }

    public static PerformanceUpdateDto of(
            final ReqPerformanceUpdateDto reqPerformanceUpdateDto,
            final Long performanceId,
            final Long userId) {
        return builder()
                .id(performanceId)
                .writerId(userId)
                .title(reqPerformanceUpdateDto.getTitle())
                .content(reqPerformanceUpdateDto.getContent())
                .posterImg(reqPerformanceUpdateDto.getPosterImg())
                .performanceStartAt(reqPerformanceUpdateDto.getPerformanceStartAt())
                .performanceEndAt(reqPerformanceUpdateDto.getPerformanceEndAt())
                .build();
    }
}
