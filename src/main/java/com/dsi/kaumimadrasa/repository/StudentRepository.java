package com.dsi.kaumimadrasa.repository;

import com.dsi.kaumimadrasa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
