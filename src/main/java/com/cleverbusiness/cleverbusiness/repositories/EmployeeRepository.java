package com.cleverbusiness.cleverbusiness.repositories;

import com.cleverbusiness.cleverbusiness.models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Date;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Long> {

    @Query("SELECT employee FROM EmployeeModel employee WHERE employee.businessLocation = :businessLocation AND  employee.date BETWEEN ?1 AND ?2")
    List<EmployeeModel> search (@Param("businessLocation") String businessLocation,@Param("dateFrom")Date dateFrom,@Param("dateTo")Date dateTo,@Param("descriptionFilter") String descriptionFilter);

    @Query("SELECT AVG(employee.gender) AS promedio FROM EmployeeModel employee WHERE employee.date BETWEEN ?1 AND ?2")
    List<EmployeeModel> average (@Param("dateFrom")Date dateFrom,@Param("dateTo")Date dateTo);
}