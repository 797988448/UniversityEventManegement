package com.universityEventManagment.universityEventManagment.studentService;

import com.universityEventManagment.universityEventManagment.StudentRepo.IStudentRepo;
import com.universityEventManagment.universityEventManagment.studentModel.Department;
import com.universityEventManagment.universityEventManagment.studentModel.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudentModel(StudentModel newstudent) {
        iStudentRepo.save(newstudent);
        return "Added Student ";
    }

    public String updateDepartment(Long id, Department newDepatment) {
        StudentModel st=iStudentRepo.findById(id).orElse(null);
        if(st!=null){
            st.setDepartment(newDepatment);
            iStudentRepo.save(st);
            return"Update Department";
        }
        return "Student Id not exist!";
    }

    public String deleteStudent(Long id) {
        iStudentRepo.deleteById(id);
        return "Delete Student";
    }

    public List<StudentModel> getAllStudent() {
        return (List<StudentModel>) iStudentRepo.findAll();
    }


    public String getStudent(Long id) {

        for(StudentModel sm:getAllStudent()){
            if(sm.getStudentId().equals(id)){
                return "Student Id find   "+id;
            }
        }
        return "Not Exist Student Id";
    }
}
