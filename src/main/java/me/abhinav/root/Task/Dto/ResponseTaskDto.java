package me.abhinav.root.Task.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class ResponseTaskDto {
    Integer id;
    String name;
    Date dueDate;
    Boolean isCompleted;
}