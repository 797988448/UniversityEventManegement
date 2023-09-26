package com.universityEventManagment.universityEventManagment.StudentRepo;

import com.universityEventManagment.universityEventManagment.studentModel.EventModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<EventModel,Long> {

    List<EventModel> findByDate(LocalDate date);
}
