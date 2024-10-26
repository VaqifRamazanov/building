package com.matrix.final_project.controller;

import com.matrix.final_project.model.dto.requestDto.AnnouncementRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.service.AnnouncementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/announcement"})
public class AnnouncementController {
    private final AnnouncementService announcementService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnnouncementResponseDto add(@RequestBody AnnouncementRequestDto announcementRequestDto){
        return announcementService.add(announcementRequestDto);
    }
    @GetMapping({"/{id}"})
    public AnnouncementResponseDto findById(@PathVariable Integer id){

        return announcementService.findById(id);
    }
    @PutMapping
    public AnnouncementResponseDto update(@RequestBody AnnouncementRequestDto announcementRequestDto){

        return announcementService.update(announcementRequestDto);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){

        announcementService.delete(id);
    }
    @GetMapping
    public List<AnnouncementResponseDto> findAll()
    {
      return  announcementService.findAll();

    }
}
