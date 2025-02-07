package br.edu.zup.school_db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SchoolRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findByNameContaining(String name);

    List<StudentEntity> findByAge(Integer age);

    @Query(value = "SELECT * FROM alunos", nativeQuery = true)
    List<StudentEntity> findEverybody();

    @Query(value = "SELECT * FROM alunos WHERE id = :id", nativeQuery = true)
    Optional<StudentEntity> findWhereId(Long id);

    @Query(value = "SELECT * FROM alunos WHERE nome LIKE %:name%", nativeQuery = true)
    List<StudentEntity> findWhereName(String name);

    @Query(value = "SELECT * FROM alunos WHERE idade = :age", nativeQuery = true)
    List<StudentEntity> findWhereAge(Integer age);

}
