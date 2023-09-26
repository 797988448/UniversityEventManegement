package com.universityEventManagment.universityEventManagment.studentController;

import com.universityEventManagment.universityEventManagment.studentModel.Department;
import com.universityEventManagment.universityEventManagment.studentModel.StudentModel;
import com.universityEventManagment.universityEventManagment.studentService.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("posts")

    public String addStudentModel(@RequestBody @Valid StudentModel newstudent){
        return studentService.addStudentModel(newstudent);

    }
    @PutMapping("update/student/id")
    public String updateDepartment(@RequestParam Long id, @RequestParam Department newDepatment){
        return studentService.updateDepartment(id,newDepatment);
    }
    @DeleteMapping("Delete/Name/firstName")
    public String deleteStudent(@RequestParam Long id){
        return studentService.deleteStudent(id);

    }
    @GetMapping("gets")
    public List<StudentModel>getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("id")
    public String getStudent(@RequestParam Long id){
    return studentService.getStudent(id);
    }

}
