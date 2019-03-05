package hello;

import hello.com.hung.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class StudentResource {

    @GetMapping("/api/student")
    public Student listStudent() {
        Student student = new Student();
        student.setName("Hung");
        student.setAge(38);
        student.setClassName("It Truong Doi");

        return student;
    }

}
