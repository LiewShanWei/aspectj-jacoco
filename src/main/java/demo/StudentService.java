package demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student testingStudent(String name){
        return new Student(name);
    }
}
