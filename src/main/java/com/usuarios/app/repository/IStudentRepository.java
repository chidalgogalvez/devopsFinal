package com.usuarios.app.repository;


import com.usuarios.app.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Long> {
}
