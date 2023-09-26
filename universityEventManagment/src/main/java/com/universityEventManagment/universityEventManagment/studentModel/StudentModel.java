package com.universityEventManagment.universityEventManagment.studentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentModel {
    @Id
    private Long studentId;
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name must start with a capital letter")
    private String firstName;
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "Last name must start with a capital letter")
    private String lastName;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 25, message = "Age must not exceed 25")
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
