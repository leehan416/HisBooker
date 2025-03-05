package com.hgu.hisbooker.performance.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgu.hisbooker.performance.domain.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    Optional<Performance> findByIdAndDeletedFalse(Long id);
}
