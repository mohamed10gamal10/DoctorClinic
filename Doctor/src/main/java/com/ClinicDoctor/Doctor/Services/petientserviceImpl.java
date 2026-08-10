package com.ClinicDoctor.Doctor.Services;

import com.ClinicDoctor.Doctor.Entity.*;
import com.ClinicDoctor.Doctor.repo.Doctorrepo;
import com.ClinicDoctor.Doctor.repo.petientrepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class petientserviceImpl implements servicepetient{

    private final petientrepo petientrepo;
    private  final Doctorrepo doctorrepo;

    public petientserviceImpl(petientrepo petientrepo, Doctorrepo doctorrepo) {
        this.petientrepo = petientrepo;
        this.doctorrepo = doctorrepo;
    }


    @Override
    public List<petient> getall() {
        return petientrepo.findAll();
    }

    @Override
    public void deleteall() {
      petientrepo.deleteAll();
    }

    @Override
    public void deletebyid(UUID id) {
petientrepo.deleteById(id);
    }

    @Override
    public Optional<petient> getbyid(UUID id) {
        return Optional.of(petientrepo.findById(id).orElseThrow(()->new RuntimeException("NOt found petient")));
    }

    @Override
    public petient Updatebyid(UUID id,petient petient) {
        petient petient1=petientrepo.findById(id).orElseThrow(()->new RuntimeException("not found  or id is not correct"));
        petient1.setName(petient.getName());
        petient1.setPhone(petient.getPhone());
        petient1.setEmail(petient.getEmail());
        petient1.setMedcine(petient.getMedcine());
      return   petientrepo.save(petient1);
    }

    @Override
    public petient updateemail(UUID id, petientemailDto petientemailDto) {
        petient petient=petientrepo.findById(id).orElseThrow(()->new RuntimeException("not found  or id is not correct"));
        petient.setEmail(petientemailDto.getEmail());
      return   petientrepo.save(petient);


    }

    @Override
    public petient updatephone(UUID id, petientphoneDto petientphoneDto) {
        petient petient=petientrepo.findById(id).orElseThrow(()->new RuntimeException("not found  or id is not correct"));
        petient.setPhone(petientphoneDto.getPhone());
       return petientrepo.save(petient);

    }

    @Override
    public petient updatemedcine(UUID id, petientmedcineDto petientmedcineDto) {
        petient petient=petientrepo.findById(id).orElseThrow(()->new RuntimeException("not found  or id is not correct"));
        petient.setMedcine(petientmedcineDto.getMedcine());
        return   petientrepo.save(petient);

    }

    @Override
    public petient addpetient(petient petient) {
        return petientrepo.save(petient);
    }

    @Override
    public petient addpetienttodoctor(UUID id1, UUID id) {
        petient petient1=petientrepo.findById(id1).orElseThrow(()->new RuntimeException("not found"));
        Doctor doctor=doctorrepo.findById(id).orElseThrow(()->new RuntimeException("not found doctor"));
        boolean add = petient1.getDoctors().add(doctor);
        if(add)
        return petientrepo.save(petient1);
        else
            return petientrepo.save(petient1);
    }
}
