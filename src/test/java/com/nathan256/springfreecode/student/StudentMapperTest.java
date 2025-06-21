package com.nathan256.springfreecode.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

    private StudentMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new StudentMapper();
    }

    @Test
    public void shouldMapStudentDtoToStudent() {
        StudentDto dto = new StudentDto(
                "John",
                "Doe",
                "john@mail.com",
                1
        );

        Student student = mapper.toStudent(dto);

        assertEquals(dto.firstName(), student.getFirstName());
        assertEquals(dto.lastName(), student.getLastName());
        assertEquals(dto.email(), student.getEmail());
        assertNotNull(student.getSchool());
        assertEquals(dto.schoolId(), student.getSchool().getId());
    }

    @Test
    public void should_throw_null_pointer_exception_when_studentDto_is_null() {
        var exp = assertThrows(NullPointerException.class, () -> mapper.toStudent(null));
        assertEquals("StudentDto cannot be null", exp.getMessage());
    }

    @Test
    public void shouldMapStudentToStudentResponseDto() {
        // Given
        Student student = new Student(
                "Jane",
                "Smith",
                "jane@mail.com",
                20);

        // When
        StudentResponseDto response = mapper.toStudentResponseDto(student);

        // Then
        assertEquals(student.getFirstName(), response.firstName());
        assertEquals(student.getLastName(), response.lastName());
        assertEquals(student.getEmail(), response.email());

    }

}