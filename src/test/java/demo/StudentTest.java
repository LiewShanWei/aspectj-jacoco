package demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class StudentTest {
    @InjectMocks
    StudentService studentService;

    @Test
    public void testingStudent_GivenName_ShouldReturnStudentWithName(){
        Student result = studentService.testingStudent("test");
        assertThat(result.getName()).isEqualTo("test");
    }
}
