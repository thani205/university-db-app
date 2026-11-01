package com.example.universitydb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.universitydb.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

    Optional<Lecturer> findByEmail(String email);

    // Find lecturers by department code
    List<Lecturer> findByDepartment_Code(String departmentCode);
}