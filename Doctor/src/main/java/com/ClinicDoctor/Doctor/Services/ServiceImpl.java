package com.ClinicDoctor.Doctor.Services;

import com.ClinicDoctor.Doctor.Entity.Doctor;
import com.ClinicDoctor.Doctor.Entity.DoctorUpdateemailDto;
import com.ClinicDoctor.Doctor.Entity.DoctorrphoneDto;
import com.ClinicDoctor.Doctor.repo.Doctorrepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    private final Doctorrepo doctorrepo;

    public ServiceImpl(Doctorrepo doctorrepo) {
        this.doctorrepo = doctorrepo;
    }

    @Override
    public List<Doctor> getall() {
        return doctorrepo.findAll();
    }

    @Override
    public Optional<Doctor> GetDoctorbyid(UUID id) {
        return Optional.of(doctorrepo.findById(id).orElseThrow(()-> new RuntimeException("Doctor not found or id is not correct")));
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorrepo.save(doctor);
    }

    @Override
    public void deletebyid(UUID id) {
         doctorrepo.deleteById(id);
    }

    @Override
    public void deletall() {
        doctorrepo.deleteAll();
    }

    @Override
    public Doctor Updateemail(UUID id, DoctorUpdateemailDto doctorUpdateemailDto) {
        Doctor doctorupdateemail=doctorrepo.findById(id).orElseThrow(()->new RuntimeException("NOt found Doctor or email is not correct"));
        doctorupdateemail.setEmail(doctorUpdateemailDto.getEmail());
        return doctorrepo.save(doctorupdateemail);
    }

    @Override
    public Doctor UPdatephone(UUID id, DoctorrphoneDto doctorrphoneDto) {
        Doctor doctor=doctorrepo.findById(id).orElseThrow(()-> new RuntimeException("NOt found Doctor"));
        doctor.setPhone(doctorrphoneDto.getPhone());
        return doctorrepo.save(doctor);
    }

}
