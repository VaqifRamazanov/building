package com.matrix.final_project.controller;

import com.matrix.final_project.model.dto.requestDto.ConstructionCompanyRequestDto;
import com.matrix.final_project.model.dto.responseDto.AnnouncementResponseDto;
import com.matrix.final_project.model.dto.responseDto.CommentResponseDto;
import com.matrix.final_project.model.dto.responseDto.ConstructionCompanyResponseDto;
import com.matrix.final_project.service.ConstructionCompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/constructionCompany"})
public class ConstructionCompanyController {
    private final ConstructionCompanyService constructionCompanyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConstructionCompanyResponseDto add(@RequestBody ConstructionCompanyRequestDto constructionCompanyRequestDto) {
        return constructionCompanyService.add(constructionCompanyRequestDto);
    }

    @GetMapping({"/{id}"})
    public ConstructionCompanyResponseDto findById(@PathVariable Integer id) {

        return constructionCompanyService.findById(id);
    }

    @PutMapping
    public ConstructionCompanyResponseDto update(@RequestBody ConstructionCompanyRequestDto constructionCompanyRequestDto) {

        return constructionCompanyService.update(constructionCompanyRequestDto);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {

        constructionCompanyService.delete(id);
    }

    @GetMapping
    public List<ConstructionCompanyResponseDto> findAll() {

        return constructionCompanyService.findAll();
    }

    @GetMapping("/{id}/announcements")
    public List<AnnouncementResponseDto> getAnnouncementByConstructionCompany(@PathVariable Integer id) {
        return constructionCompanyService.getAnnouncementByConstructionCompany(id);
    }

    @GetMapping("/{id}/comments")
    public List<CommentResponseDto> getCommentByConstructionCompany(@PathVariable Integer id){
        return constructionCompanyService.getCommentBYConstructionCompany(id);
    }
}
