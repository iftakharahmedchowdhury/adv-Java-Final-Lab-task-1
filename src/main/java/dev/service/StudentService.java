package dev.service;

import dev.domain.Student;
import dev.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public void create(@Valid Student student) throws SQLException {
        student.setFullname(student.getFullname().toUpperCase());
        studentRepository.create(student);
    }

    public List<Student> showAll() throws SQLException {
        return studentRepository.showAll();
    }

    public void deleteUserById(int id) throws SQLException {
        studentRepository.deleteById(id);
    }

    public Student showStudentDetails(int id) throws SQLException {
        return studentRepository.showStudentDetails(id);
    }


    public void EditUser(Student student) throws SQLException {
        studentRepository.EditUser(student);

    }
}
