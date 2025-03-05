package com.hgu.hisbooker.performance.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import com.hgu.hisbooker.comon.domain.BaseEntity;
import com.hgu.hisbooker.performance.dto.PerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.PerformanceUpdateDto;
import com.hgu.hisbooker.user.domain.User;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@Entity
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Performance extends BaseEntity {

    private String title;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User writer;

    private String content;

    private String posterImg; // url?

    //    private venue // 장소

    //    private genre // 장르

    private LocalDateTime performanceStartAt;
    private LocalDateTime performanceEndAt;

    public static Performance of(final PerformanceCreateDto performanceCreateDto, final User user) {
        return builder()
                .title(performanceCreateDto.getTitle())
                .writer(user)
                .content(performanceCreateDto.getContent())
                .posterImg(performanceCreateDto.getPosterImg())
                .performanceStartAt(performanceCreateDto.getPerformanceStartAt())
                .performanceEndAt(performanceCreateDto.getPerformanceEndAt())
                .build();
    }

    public Performance update(final PerformanceUpdateDto performanceUpdateDto) {
        this.title = performanceUpdateDto.getTitle();
        this.content = performanceUpdateDto.getContent();
        this.posterImg = performanceUpdateDto.getPosterImg();
        this.performanceStartAt = performanceUpdateDto.getPerformanceStartAt();
        this.performanceEndAt = performanceUpdateDto.getPerformanceEndAt();
        return this;
    }
}
