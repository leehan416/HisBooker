package com.hgu.hisbooker.performance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hgu.hisbooker.performance.dto.PerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.PerformanceUpdateDto;
import com.hgu.hisbooker.performance.dto.request.ReqPerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.request.ReqPerformanceUpdateDto;
import com.hgu.hisbooker.performance.dto.response.ResPerformanceCreateDto;
import com.hgu.hisbooker.performance.dto.response.ResPerformanceDetailDto;
import com.hgu.hisbooker.performance.dto.response.ResPerformanceUpdateDto;
import com.hgu.hisbooker.performance.serivce.PerformanceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/performance")
@RequiredArgsConstructor
public class PerformanceController {
    private final PerformanceService performanceService;

    @PostMapping("")
    public ResponseEntity<ResPerformanceCreateDto> createPerformance(
            @RequestBody ReqPerformanceCreateDto reqPerformanceCreateDto) {
        return ResponseEntity.ok(
                ResPerformanceCreateDto.from(
                        performanceService.createPerformance(
                                PerformanceCreateDto.of(
                                        reqPerformanceCreateDto,
                                        1L /*TODO : change to security*/))));
    }

    @PutMapping("/{performanceId}")
    public ResponseEntity<ResPerformanceUpdateDto> updatePerformance(
            @PathVariable Long performanceId,
            @RequestBody ReqPerformanceUpdateDto ReqPerformanceUpdateDto) {
        return ResponseEntity.ok(
                ResPerformanceUpdateDto.from(
                        performanceService.updatePerformance(
                                PerformanceUpdateDto.of(
                                        ReqPerformanceUpdateDto,
                                        performanceId,
                                        1L /*TODO : change to security*/))));
    }

    @GetMapping("/{performanceId}")
    public ResponseEntity<ResPerformanceDetailDto> getPerformance(
            @PathVariable Long performanceId) {
        return ResponseEntity.ok(
                ResPerformanceDetailDto.from(performanceService.getPerformance(performanceId)));
    }

    @DeleteMapping("/{performanceId}")
    public ResponseEntity<Void> deletePerformance(@PathVariable Long performanceId) {
        performanceService.deletePerformance(
                PerformanceUpdateDto.builder().id(performanceId).build());
        return ResponseEntity.ok().build();
    }
}
