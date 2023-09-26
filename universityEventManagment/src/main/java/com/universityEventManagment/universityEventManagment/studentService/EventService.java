package com.universityEventManagment.universityEventManagment.studentService;

import com.universityEventManagment.universityEventManagment.StudentRepo.IEventRepo;
import com.universityEventManagment.universityEventManagment.studentModel.EventModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;

    public String addEventModel(EventModel newEvent) {

        iEventRepo.save(newEvent);

        return "Added all Event";
    }

    public String updateEvent(Long id, String neme) {
        EventModel ev=iEventRepo.findById(id).orElse(null);
        if(ev !=null){
            ev.setEventName(neme);
            iEventRepo.save(ev);
            return "EventNme Update";
        }
        return "EventId Not exist!";
    }

    public String DeleteEvent(Long id) {
        iEventRepo.deleteById(id);
        return "Delete Event";
    }


    public List<EventModel> getByDate(LocalDate date) {
        return iEventRepo.findByDate(date);
    }
}
