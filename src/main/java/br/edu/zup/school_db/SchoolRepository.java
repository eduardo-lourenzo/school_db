package br.edu.zup.school_db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<StudentEntity, Long> {
}
