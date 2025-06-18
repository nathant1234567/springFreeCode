package com.nathan256.springfreecode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {

    private final SchoolService schoolService;
    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolService schoolService, SchoolRepository schoolRepository) {
        this.schoolService = schoolService;
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/schools")
    public SchoolDto create(
            @RequestBody SchoolDto dto
    ) {
        return this.schoolService.create(dto);
    }


    @GetMapping("/schools")
    public List<SchoolDto> findAll(){
        return schoolService.findAll();
    }
}
