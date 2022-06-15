package za.co.itutoronline.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.itutoronline.studentmanagementsystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
