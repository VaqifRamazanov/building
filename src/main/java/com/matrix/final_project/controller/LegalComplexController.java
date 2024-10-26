package com.matrix.final_project.controller;

import com.matrix.final_project.model.dto.requestDto.LegalComplexRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.LegalComplexResponseDto;
import com.matrix.final_project.model.entity.LegalComplex;
import com.matrix.final_project.service.LegalComplexService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/legalComplex"})
public class LegalComplexController {
private final LegalComplexService legalComplexService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LegalComplexResponseDto add(@RequestBody LegalComplexRequestDto legalComplexRequestDto){
        return legalComplexService.add(legalComplexRequestDto);
    }
    @GetMapping({"/{id}"})
    public LegalComplexResponseDto findById(@PathVariable Integer id){

        return legalComplexService.findById(id);
    }
    @PutMapping
    public LegalComplexResponseDto Update(@RequestBody LegalComplexRequestDto legalComplexRequestDto){

        return legalComplexService.update(legalComplexRequestDto);
    }
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){

        legalComplexService.delete(id);
    }
    @GetMapping
    public List<LegalComplexResponseDto> findAll(){

       return legalComplexService.findAll();
    }

    @GetMapping("/{id}/announcements")
    public List<AnnouncementResponseDto> getAnnouncementByLegalComplex(@PathVariable Integer id){
        return legalComplexService.getAnnouncementByLegalComplex(id);
    }
}
