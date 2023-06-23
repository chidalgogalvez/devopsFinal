package com.usuarios.app.service;


import com.usuarios.app.entity.Student;
import java.util.List;
import java.util.Optional;

public interface IStudentService {
   List<Student> listAllStudents();
   Student saveStudent(Student student);
   Optional<Student> getStudentById(Long id);
   Student updatedStudent(Student student);
   void deleteStudentById(Long id);
}
