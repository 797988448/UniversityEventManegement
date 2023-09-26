package com.universityEventManagment.universityEventManagment.studentController;

import com.universityEventManagment.universityEventManagment.studentModel.EventModel;
import com.universityEventManagment.universityEventManagment.studentService.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("post")
    public String addEventModel(@RequestBody @Valid  EventModel newEvent){
    return eventService.addEventModel(newEvent);
    }
    @PutMapping("update/event/id")
    public String updateEvent(@RequestParam Long id,@RequestParam String neme){
        return eventService.updateEvent(id,neme);
    }
    @DeleteMapping("Delete/id")
    public String DeleteEvent(@RequestParam Long id){
        return eventService.DeleteEvent(id);
    }
    @GetMapping("date/id")
    public List<EventModel>getByDate(@RequestParam LocalDate date){
        return eventService.getByDate(date);
    }
}
