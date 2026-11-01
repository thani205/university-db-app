package com.example.universitydb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.universitydb.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Find student by student code
    Optional<Student> findByStudentCode(String studentCode);

    // Search students by name
    List<Student> findByFullNameContainingIgnoreCase(String text);

    // Sort students by full name
    List<Student> findAllByOrderByFullNameAsc();

    // Check whether email exists
    boolean existsByEmail(String email);

    // Count students by email domain
    long countByEmailEndingWith(String domain);
}