package com.ClinicDoctor.Doctor.Services;

import com.ClinicDoctor.Doctor.Entity.petient;
import com.ClinicDoctor.Doctor.Entity.petientemailDto;
import com.ClinicDoctor.Doctor.Entity.petientmedcineDto;
import com.ClinicDoctor.Doctor.Entity.petientphoneDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface servicepetient {
    public List<petient>getall();
    public void deleteall();
    public void deletebyid(UUID id);
    public Optional<petient> getbyid(UUID id);
    public petient Updatebyid(UUID id,petient petient);
    public petient updateemail(UUID id, petientemailDto petientemailDto);
    public petient updatephone(UUID id, petientphoneDto petientphoneDto);
    public petient updatemedcine(UUID id, petientmedcineDto petientmedcineDto);
    public petient addpetient(petient petient);
    public petient addpetienttodoctor(UUID id1,UUID id);

}
