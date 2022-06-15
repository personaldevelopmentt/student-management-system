package za.co.itutoronline.studentmanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.itutoronline.studentmanagementsystem.model.Student;
import za.co.itutoronline.studentmanagementsystem.repository.StudentRepository;
import za.co.itutoronline.studentmanagementsystem.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

//    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
