package br.edu.zup.school_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<StudentEntity> getAllStudents() {
        return schoolRepository.findAll();
    }

    public StudentEntity getStudentById(Long id) {
        return schoolRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Aluno com Id: " + id + "não encontrado."));
    }

    public List<StudentEntity> getStudentByName(String name) {
        return schoolRepository.findByNameContaining(name);
    }

    public List<StudentEntity> getStudentByAge(Integer age) {
        return schoolRepository.findByAge(age);
    }

    public List<StudentEntity> getEverybodyStudents() {
        return schoolRepository.findEverybody();
    }

    public StudentEntity getStudentWhereId(Long id) {
        return schoolRepository.findWhereId(id).orElseThrow(() ->
                new NoSuchElementException("Aluno com Id: " + id + "não encontrado."));
    }

    public List<StudentEntity> getStudentWhereName(String name) {
        return schoolRepository.findWhereName(name);
    }

    public List<StudentEntity> getStudentWhereAge(Integer age) {
        return schoolRepository.findWhereAge(age);
    }
}
