package com.ClinicDoctor.Doctor.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNullFields;

import java.util.*;

@Entity
@Table( name = "petient_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class petient {
    @Id
    @Column(name="petient_id")
    @GeneratedValue
    private UUID petient_id;

    @NotNull
    @NotBlank
    @Column(
            name="peteint_name"
    )
    private String name;
    @NotNull
    @NotBlank
    @Pattern(regexp = "01[0-9]{9}")
    @Column(name="peteint_phone",unique = true)
    private String phone;
@NotNull
@Email
@Column(name="petient_email",unique = true)
    private String email;
@ElementCollection
@CollectionTable(name="petient_medcine",joinColumns =@JoinColumn(name="petient_id"))
    private List<String>medcine=new ArrayList<>();

    @JsonManagedReference
@ManyToMany
    @JoinTable(
            name="patient_doctor_id",
            joinColumns = @JoinColumn(name="patient_id"),
            inverseJoinColumns = @JoinColumn(name="doctor_id")
    )
    private Set<Doctor>doctors;






}
