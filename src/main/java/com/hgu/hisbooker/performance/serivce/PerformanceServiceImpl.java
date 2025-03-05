package com.hgu.hisbooker.performance.serivce;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hgu.hisbooker.performance.domain.Performance;
import com.hgu.hisbooker.performance.dto.PerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.PerformanceDetailDto;
import com.hgu.hisbooker.performance.dto.PerformanceUpdateDto;
import com.hgu.hisbooker.performance.repo.PerformanceRepository;
import com.hgu.hisbooker.user.domain.User;
import com.hgu.hisbooker.user.repo.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerformanceServiceImpl implements PerformanceService {

    private final PerformanceRepository performanceRepository;
    private final UserRepository userRepository;

    @Override
    public PerformanceCreateDto createPerformance(final PerformanceCreateDto performanceCreateDto) {
        final User user =
                userRepository
                        .findByIdAndDeletedFalse(performanceCreateDto.getWriterId())
                        .orElseThrow(() -> new RuntimeException("sibal"));
        final Performance performance = Performance.of(performanceCreateDto, user);
        final Performance savedperformance = performanceRepository.save(performance);
        return PerformanceCreateDto.from(savedperformance);
    }

    @Override
    @Transactional
    public PerformanceUpdateDto updatePerformance(final PerformanceUpdateDto performanceUpdateDto) {
        final Performance performance =
                performanceRepository
                        .findByIdAndDeletedFalse(performanceUpdateDto.getId())
                        .orElseThrow(() -> new RuntimeException("sibal"));
        final Performance updatedperformance = performance.update(performanceUpdateDto);
        return PerformanceUpdateDto.from(updatedperformance);
    }

    @Override
    public PerformanceDetailDto getPerformance(final Long performanceId) {
        final Performance performance =
                performanceRepository
                        .findByIdAndDeletedFalse(performanceId)
                        .orElseThrow(() -> new RuntimeException("sibal"));
        return PerformanceDetailDto.from(performance);
    }

    @Override
    @Transactional
    public void deletePerformance(final PerformanceUpdateDto performanceUpdateDto) {
        final Performance performance =
                performanceRepository
                        .findByIdAndDeletedFalse(performanceUpdateDto.getId())
                        .orElseThrow(() -> new RuntimeException("sibal"));
        performance.delete();
    }
}
