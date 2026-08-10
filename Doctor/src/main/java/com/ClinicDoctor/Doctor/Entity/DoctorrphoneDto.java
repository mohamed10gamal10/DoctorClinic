package com.ClinicDoctor.Doctor.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class DoctorrphoneDto{
    @NotBlank
    @Pattern(regexp = "01[0-9]{9}")
    String phone;
}
