package com.hgu.hisbooker.performance.serivce;

import org.springframework.stereotype.Service;

import com.hgu.hisbooker.performance.dto.PerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.PerformanceDetailDto;
import com.hgu.hisbooker.performance.dto.PerformanceUpdateDto;

@Service
public interface PerformanceService {
    public PerformanceCreateDto createPerformance(PerformanceCreateDto performanceCreateDto);

    public PerformanceUpdateDto updatePerformance(PerformanceUpdateDto performanceUpdateDto);

    public PerformanceDetailDto getPerformance(Long performanceId);

    public void deletePerformance(PerformanceUpdateDto performanceUpdateDto);
}
