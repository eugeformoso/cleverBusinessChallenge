package com.cleverbusiness.cleverbusiness.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Entity
@Table(name="Employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private Long idEmployee;
    private Date date;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @ManyToOne
    @JoinColumn (name = "gender_id",nullable = false)
    private TypeManagement gender;
    @ManyToOne
    @JoinColumn (name = "register_type_id",nullable = false)
    private TypeManagement registerType;
    @ManyToOne
    @JoinColumn (name = "business_location_id",nullable = false)
    private TypeManagement businessLocation;


    public EmployeeModel (Long idEmployee, Date date, String firstName, String lastName, TypeManagement gender,TypeManagement registerType, TypeManagement businessLocation){
        this.idEmployee=idEmployee;
        this.date=date;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.registerType=registerType;
        this.businessLocation=businessLocation;
    }

    public EmployeeModel() {

    }

    public Long getIdEmployee (){
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee){
        this.idEmployee=idEmployee;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public TypeManagement getGender(){
        return gender;
    }

    public void setGender(TypeManagement gender){
        this.gender=gender;
    }

    public TypeManagement getRegisterType(){
        return registerType;
    }

    public void setRegisterType (TypeManagement registerType){
        this.registerType=registerType;
    }

    public TypeManagement getBusinessLocation(){
        return businessLocation;
    }

    public void setBusinessLocation(TypeManagement businessLocation){
        this.businessLocation=businessLocation;
    }

}