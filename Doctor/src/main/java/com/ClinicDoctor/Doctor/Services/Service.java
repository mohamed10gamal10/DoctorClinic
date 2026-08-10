package com.ClinicDoctor.Doctor.Services;

import com.ClinicDoctor.Doctor.Entity.Doctor;
import com.ClinicDoctor.Doctor.Entity.DoctorUpdateemailDto;
import com.ClinicDoctor.Doctor.Entity.DoctorrphoneDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@org.springframework.stereotype.Service
public interface Service {
    public List<Doctor> getall();
    public Optional<Doctor> GetDoctorbyid(UUID id);
    public Doctor addDoctor(Doctor doctor);
    public void deletebyid(UUID id);
    public void deletall();
    public Doctor Updateemail(UUID id, DoctorUpdateemailDto doctorUpdateemailDto);
    public  Doctor UPdatephone(UUID id, DoctorrphoneDto doctorrphoneDto);
}
