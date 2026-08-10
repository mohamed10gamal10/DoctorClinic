package com.ClinicDoctor.Doctor.Entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class petientemailDto {
    @NotNull
    @Email
    @Column(name = "petient_email", unique = true)
    private String email;
}
