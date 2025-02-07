package br.edu.zup.school_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    // JPA
    @GetMapping("/jpa")
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return ResponseEntity.ok().body(schoolService.getAllStudents());
    }
    @GetMapping("/jpa/id/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok().body(schoolService.getStudentById(id));
    }
    @GetMapping("/jpa/name/{name}")
    public ResponseEntity<List<StudentEntity>> getStudentByName(@PathVariable String name) {
        return ResponseEntity.ok().body(schoolService.getStudentByName(name));
    }
    @GetMapping("/jpa/age/{age}")
    public ResponseEntity<List<StudentEntity>> getStudentByAge(@PathVariable Integer age) {
        return ResponseEntity.ok().body(schoolService.getStudentByAge(age));
    }

    // SQL
    @GetMapping("/sql")
    public ResponseEntity<List<StudentEntity>> getEverybodyStudents() {
        return ResponseEntity.ok().body(schoolService.getEverybodyStudents());
    }
    @GetMapping("/sql/id/{id}")
    public ResponseEntity<StudentEntity> getStudentWhereId(@PathVariable Long id) {
        return ResponseEntity.ok().body(schoolService.getStudentWhereId(id));
    }
    @GetMapping("/sql/name/{name}")
    public ResponseEntity<List<StudentEntity>> getStudentWhereName(@PathVariable String name) {
        return ResponseEntity.ok().body(schoolService.getStudentWhereName(name));
    }
    @GetMapping("/sql/age/{age}")
    public ResponseEntity<List<StudentEntity>> getStudentWhereAge(@PathVariable Integer age) {
        return ResponseEntity.ok().body(schoolService.getStudentWhereAge(age));
    }
}