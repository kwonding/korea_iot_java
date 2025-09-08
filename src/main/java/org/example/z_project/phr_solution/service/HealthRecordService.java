package org.example.z_project.phr_solution.service;

import org.example.z_project.phr_solution.dto.health_record.request.RecordCreateRequestDto;
import org.example.z_project.phr_solution.dto.health_record.response.RecordListResponseDto;

import java.util.List;

public interface HealthRecordService {
    // 생성
    void createRecord(RecordCreateRequestDto dto);
    // 전체 조회
    List<RecordListResponseDto> getAllRecords();
    // 단건 조회
    List<RecordListResponseDto> filterRecordsByDiagnosis(String diagnosis);
    // 삭제
//    void deleteRecord(Long id);
    boolean deleteRecord(Long id);
}
