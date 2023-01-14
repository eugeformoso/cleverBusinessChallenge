package com.cleverbusiness.cleverbusiness.services;

import com.cleverbusiness.cleverbusiness.models.EmployeeModel;
import com.cleverbusiness.cleverbusiness.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeModel> getAll() {
        return employeeRepository.findAll();
    }

    public EmployeeModel getEmployee(Long idEmployee) {
        return employeeRepository.findById(idEmployee).orElse(null);
    }

    public EmployeeModel saveEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeModel upDateEmployee(EmployeeModel upDateEmployee){
        EmployeeModel employee = employeeRepository.findById(upDateEmployee.getIdEmployee()).orElse(null);;
        if (employee ==  null){
            return null;
        }
        employee.setDniEmployee(upDateEmployee.getDniEmployee());
        employee.setDate(upDateEmployee.getDate());
        employee.setFirstName(upDateEmployee.getFirstName());
        employee.setLastName(upDateEmployee.getLastName());
        employee.setGender(upDateEmployee.getGender());
        employee.setRegisterType(upDateEmployee.getRegisterType());
        employee.setBusinessLocation(upDateEmployee.getBusinessLocation());
        employee.setStatus(upDateEmployee.getStatus());
        return employeeRepository.save(employee);
    }

    public EmployeeModel deleteEmployee(Long idEmployee) {
        EmployeeModel employee = employeeRepository.findById(idEmployee).orElse(null);;
        if (employee ==  null){
            return null;
        }
        employee.setStatus(EmployeeModel.Status.inactive);
        return employeeRepository.save(employee);
    }

    public void search (Date dateFrom, Date dateTo, String descriptionFilter, String businessLocation){
        return ;
    }

    public void average(Date dateFrom, Date dateTo){
       return;
    }
}
