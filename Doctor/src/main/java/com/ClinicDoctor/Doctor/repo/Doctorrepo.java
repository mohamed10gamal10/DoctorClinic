package com.ClinicDoctor.Doctor.repo;

import com.ClinicDoctor.Doctor.Entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface Doctorrepo extends JpaRepository<Doctor, UUID> {
}

