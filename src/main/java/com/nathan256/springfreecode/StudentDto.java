package com.nathan256.springfreecode;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
