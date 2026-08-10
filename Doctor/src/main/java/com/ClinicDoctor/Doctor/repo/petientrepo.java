package com.ClinicDoctor.Doctor.repo;

import com.ClinicDoctor.Doctor.Entity.petient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface petientrepo extends JpaRepository<petient,UUID> {
}
