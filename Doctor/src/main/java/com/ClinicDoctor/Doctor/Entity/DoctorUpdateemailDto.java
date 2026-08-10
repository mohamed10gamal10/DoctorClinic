package com.ClinicDoctor.Doctor.Entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class DoctorUpdateemailDto {
    @NotBlank
    String email;
}
