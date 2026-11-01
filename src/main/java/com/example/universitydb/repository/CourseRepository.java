package com.example.universitydb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.universitydb.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findByCode(String code);

    // WHERE credits >= ?
    List<Course> findByCreditsGreaterThanEqual(Integer credits);

    List<Course> findByTitleContainingIgnoreCase(String text);

    // Course -> Lecturer -> Name
    List<Course> findByLecturer_Name(String lecturerName);

    // Course -> Lecturer -> Department -> Name
    List<Course> findByLecturer_Department_Name(String departmentName);
}