package com.ClinicDoctor.Doctor.Entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class petientphoneDto {
    @NotNull
    @NotBlank
    @Pattern(regexp = "01[0-9]{9}")
    @Column(name="peteint_phone",unique = true)
    private String phone;
}
