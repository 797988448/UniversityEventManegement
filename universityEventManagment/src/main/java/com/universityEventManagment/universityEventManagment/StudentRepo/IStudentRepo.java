package com.universityEventManagment.universityEventManagment.StudentRepo;

import com.universityEventManagment.universityEventManagment.studentController.StudentController;
import com.universityEventManagment.universityEventManagment.studentModel.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<StudentModel,Long> {

}
