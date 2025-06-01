package com.nathan256.springfreecode;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }
 
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from my first controller";
    }

    @PostMapping("/students")
    public Student post(
            @RequestBody Student student
    ) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id
    ) {
        return repository.findById(id)
                .orElse(new Student());
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentByName(
            @PathVariable("student-name") String name
    ) {
        return repository.findAllByFirstNameContaining(name);
    }
}
