package com.universityEventManagment.universityEventManagment.studentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventModel {
    @Id
    private Long eventId;


    private String eventName;

    @NotBlank(message = "location is required")
    private String locationOfEvent;


    private LocalDate date;


    private LocalTime startTime;

    @NotNull(message = "EndTime is Mandatory")
    private LocalTime endTime;
}
