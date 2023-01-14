package com.cleverbusiness.cleverbusiness.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@Entity
@Table(name="Employee", uniqueConstraints={@UniqueConstraint(columnNames = {"dniEmployee"})})
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private Long idEmployee;
    private Long dniEmployee;
    private Date date;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private RegisterType registerType;
    @Enumerated(EnumType.STRING)
    private BusinessLocation businessLocation;
    @Enumerated(EnumType.STRING)
    private Status status;

    public static enum RegisterType{
        income,
        expenses
    }

    public static enum BusinessLocation{
        Argentina,
        Brasil,
        España
    }

    public static enum Status{
        active,
        inactive
    }

    public static enum Gender{
        famale,
        male
    }

    public EmployeeModel (Long idEmployee, Long dniEmployee, Date date, String firstName, String lastName, Gender gender,RegisterType registerType, BusinessLocation businessLocation, Status status){
        this.idEmployee=idEmployee;
        this.dniEmployee=dniEmployee;
        this.date=date;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.registerType=registerType;
        this.businessLocation=businessLocation;
        this.status=status;
    }

    public Long getIdEmployee (){
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee){
        this.idEmployee=idEmployee;
    }

    public Long getDniEmployee(){
        return dniEmployee;
    }

    public void setDniEmployee(Long dniEmployee){
        this.dniEmployee=dniEmployee;
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

    public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender){
        this.gender=gender;
    }

    public RegisterType getRegisterType(){
        return registerType;
    }

    public void setRegisterType (RegisterType registerType){
        this.registerType=registerType;
    }

    public BusinessLocation getBusinessLocation(){
        return businessLocation;
    }

    public void setBusinessLocation(BusinessLocation businessLocation){
        this.businessLocation=businessLocation;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus (Status status){
        this.status=status;
    }

}