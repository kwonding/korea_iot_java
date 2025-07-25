package org.example.z_project.phr_solution.controller;

import org.example.z_project.phr_solution.dto.health_record.request.RecordCreateRequestDto;
import org.example.z_project.phr_solution.dto.health_record.response.RecordListResponseDto;
import org.example.z_project.phr_solution.service.HealthRecordService;
import org.example.z_project.phr_solution.service.impl.HealthRecordServiceImpl;

import java.util.List;

public class HealthRecordController {
    private HealthRecordService healthRecordService;

    public HealthRecordController() {
        this.healthRecordService = new HealthRecordServiceImpl();
    }

    public void createRecord(RecordCreateRequestDto dto) {
        healthRecordService.createRecord(dto);
    }

    public List<RecordListResponseDto> getAllRecords() {
        return healthRecordService.getAllRecords();
    }

    //필터링 (검색)
    public List<RecordListResponseDto> filterRecordsByDiagnosis(String diagnosis) {
        return healthRecordService.filterRecordsByDiagnosis(diagnosis);
    }

//    public void deleteRecord(long id) {
//        healthRecordService.deleteRecord(id);
//    } - void를 boolean으로 바꾸고싶었음 // 삭제가 완료되었습니다를 반환하고싶어서

    public boolean deleteRecord(long id) {
        return healthRecordService.deleteRecord(id);
    }
}
