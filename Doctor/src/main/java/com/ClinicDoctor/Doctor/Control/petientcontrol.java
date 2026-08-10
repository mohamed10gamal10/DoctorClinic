package com.ClinicDoctor.Doctor.Control;

import com.ClinicDoctor.Doctor.Entity.petient;
import com.ClinicDoctor.Doctor.Services.servicepetient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/petient")
public class petientcontrol {

    private final servicepetient servicepetient;

    public petientcontrol(servicepetient servicepetient) {
        this.servicepetient = servicepetient;
    }

    @GetMapping("/all")
    public List<petient> findall() {
        return servicepetient.getall();
    }

    @PostMapping("/addpetient")
    public petient addpetient(@RequestBody petient petient) {
        return servicepetient.addpetient(petient);
    }

    @GetMapping("/{patientid}/doctors/{doctorid}")
    public petient adddoctortopetient(
            @PathVariable("patientid") UUID patientid,
            @PathVariable("doctorid") UUID doctorid) {

        return servicepetient.addpetienttodoctor(patientid, doctorid);
    }
}
