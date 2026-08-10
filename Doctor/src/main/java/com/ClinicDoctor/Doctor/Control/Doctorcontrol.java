package com.ClinicDoctor.Doctor.Control;

import com.ClinicDoctor.Doctor.Entity.Doctor;
import com.ClinicDoctor.Doctor.Entity.DoctorUpdateemailDto;
import com.ClinicDoctor.Doctor.Entity.DoctorrphoneDto;
import com.ClinicDoctor.Doctor.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/Doctor")
@RestController
public class Doctorcontrol {

    @Autowired
    private final Service service;


    public Doctorcontrol(Service service) {
        this.service = service;
    }

    @GetMapping("/findall")
    public List<Doctor> findAll()
    {
        return service.getall();
    }
    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        return service.addDoctor(doctor);
    }
    @PatchMapping("/{id}/phone")
    public Doctor updatedoctorbyphone(@PathVariable UUID id,@RequestBody DoctorrphoneDto doctorrphoneDto)
    {
        return service.UPdatephone(id,doctorrphoneDto);
    }
    @PatchMapping("/{id}/email")
    public Doctor Updateemail(@PathVariable UUID id,@RequestBody DoctorUpdateemailDto doctorUpdateemailDto)
    {
        return service.Updateemail(id,doctorUpdateemailDto);
    }
}
