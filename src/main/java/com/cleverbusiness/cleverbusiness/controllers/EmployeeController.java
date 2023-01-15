package com.cleverbusiness.cleverbusiness.controllers;

import com.cleverbusiness.cleverbusiness.models.EmployeeModel;
import com.cleverbusiness.cleverbusiness.models.ResponseError;
import com.cleverbusiness.cleverbusiness.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeModel> getAll() {
        return employeeService.getAll();
    }

    @GetMapping(value = "/employees/{idEmployee}")
    @ResponseBody
    public Object getEmployee(@PathVariable("idEmployee") Long idEmployee) {
        EmployeeModel employee = employeeService.getEmployee(idEmployee);
        if ( employee == null) {
            return new ResponseEntity(new ResponseError(404, String.format("Employee %d not found", idEmployee)), HttpStatus.NOT_FOUND);
        }
        return employee;
    }

    @PostMapping(value = "/employees")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Object createEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping(value = "/employees")
    @ResponseBody
    public Object updateEmployee(@RequestBody EmployeeModel employee) {
        EmployeeModel res = employeeService.upDateEmployee(employee);
        if ( res == null) {
            return new ResponseEntity(new ResponseError(404, String.format("Employee with ID %d not found", employee.getIdEmployee())), HttpStatus.NOT_FOUND);
        }
        return res;
    }

}