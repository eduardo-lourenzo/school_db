package br.edu.zup.school_db;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class SchoolController {

    @RequestMapping("/jpa")
    public static class JpaRequest {

        @GetMapping
        public ResponseEntity<List<StudentEntity>> getAllStudents() {
            return null;
        }

        @GetMapping("/id/{id}")
        public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id) {
            return null;
        }

        @GetMapping("/name/{name}")
        public ResponseEntity<List<StudentEntity>> getStudentByName(@PathVariable String name) {
            return null;
        }

        @GetMapping("/age/{age}")
        public ResponseEntity<List<StudentEntity>> getStudentByAge(@PathVariable Integer age) {
            return null;
        }
    }

    @RequestMapping("/sql")
    public static class SqlRequest {

        @GetMapping
        public ResponseEntity<List<StudentEntity>> getEverybodyStudents() {
            return null;
        }

        @GetMapping("/id/{id}")
        public ResponseEntity<StudentEntity> getStudentWhereId(@PathVariable Long id) {
            return null;
        }

        @GetMapping("/name/{name}")
        public ResponseEntity<List<StudentEntity>> getStudentWhereName(@PathVariable String name) {
            return null;
        }

        @GetMapping("/age/{age}")
        public ResponseEntity<List<StudentEntity>> getStudentWhereAge(@PathVariable Integer age) {
            return null;
        }
    }
}


