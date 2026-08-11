package com.ClinicDoctor.Doctor.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.Audited;

import java.util.*;

@Entity
@Table(name="doctor_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Doctor {
    @Id
    @GeneratedValue
    @Column(name="doctor_id",updatable = false)
    private UUID Id;
    @Column(name="doctor_name")
    @NotNull
    private String name;
    @Column(name="doctor_phone",unique = true)
    @NotNull
    private String phone;
    @Column(name="doctor_email",unique = true,updatable = true)
    @Email
    @NotNull
    private String email;
    @Column(name = "specialization")
   private String specialization;
    @Column(name="active")
    private  boolean active;
    @JsonBackReference
    @ManyToMany(mappedBy = "doctors")
    private Set<petient> petients;


}
