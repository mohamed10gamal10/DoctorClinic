package com.ClinicDoctor.Doctor.exeption;

import java.util.List;

public class Globalersponse<T> {
    private final String sucess="Sucess";
    private final String errordata="error";
    private final String  stute;
    private final  T data;
    public record Erroritem(String message){}
    private final List<Erroritem> errors;
    public Globalersponse(List<Erroritem> error)
    {
       this.stute = errordata;
       this.data=null;
       this.errors=error;
    }

    public Globalersponse(T data)
    {
        this.stute = sucess;
        this.data=data;
        this.errors=null;
    }





}
