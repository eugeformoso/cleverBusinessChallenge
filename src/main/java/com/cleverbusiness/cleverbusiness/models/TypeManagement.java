package com.cleverbusiness.cleverbusiness.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Type_Management")
public class TypeManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private Long id;
    private String code;
    private String value;

    public TypeManagement (Long id, String code, String value){
        this.id=id;
        this.code=code;
        this.value=value;
    }

    public TypeManagement() {

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
