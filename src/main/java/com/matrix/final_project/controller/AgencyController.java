package com.matrix.final_project.controller;

import com.matrix.final_project.model.dto.requestDto.AgencyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AgencyResponseDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.entity.Agency;

import com.matrix.final_project.service.AgencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/agency"})
public class AgencyController {
    private final AgencyService agencyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AgencyResponseDto add(@RequestBody AgencyRequestDto agencyRequestDto) {

        return agencyService.add(agencyRequestDto);
    }

    @GetMapping("/{id}")
    public AgencyResponseDto findById(@PathVariable Integer id) {

        return agencyService.findById(id);
    }

    @PutMapping
    public AgencyResponseDto Update(@RequestBody AgencyRequestDto agencyRequestDto) {

        return agencyService.update(agencyRequestDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {

        agencyService.delete(id);
    }

    @GetMapping("/agencies")
    public List<AgencyResponseDto> findAll() {

        return agencyService.findAll();
    }

    @GetMapping("/{id}/announcements")
    public List<AnnouncementResponseDto> getAnnouncementByAgency(@PathVariable Integer id){
        return agencyService.getAnnouncementByAgency(id);
    }

}


