package com.usuarios.app.service.impl;

import com.usuarios.app.entity.Student;
import com.usuarios.app.repository.IStudentRepository;
import com.usuarios.app.service.IStudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
  private final IStudentRepository repository;
  @Autowired
  public StudentServiceImpl(IStudentRepository repository) {
    this.repository = repository;
  }
  @Override
  public List<Student> listAllStudents() {
    return (List<Student>) repository.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return repository.save(student);
  }

  @Override
  public Optional<Student> getStudentById(Long id) {
    return repository.findById(id);
  }

  @Override
  public Student updatedStudent(Student student) {
    return repository.save(student);
  }

  @Override
  public void deleteStudentById(Long id) {
    repository.deleteById(id);
  }
}
