package com.example.universitydb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.universitydb.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByCode(String code);

    // JOIN FETCH loads department and lecturers in one SQL query
    @Query("SELECT d FROM Department d LEFT JOIN FETCH d.lecturers WHERE d.code = :code")
    Optional<Department> findWithLecturers(@Param("code") String code);
}