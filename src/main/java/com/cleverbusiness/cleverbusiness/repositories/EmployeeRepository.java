package com.cleverbusiness.cleverbusiness.repositories;

import com.cleverbusiness.cleverbusiness.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Date;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}