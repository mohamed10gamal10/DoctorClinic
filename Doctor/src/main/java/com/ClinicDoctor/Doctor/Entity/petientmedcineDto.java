package com.ClinicDoctor.Doctor.Entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;
@Data
public class petientmedcineDto {
    @NotEmpty
    private List<String> medcine;

}
