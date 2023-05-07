package me.abhinav.root.Task.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class Task {
    Integer id;
    String name;
    Date dueDate;
    Boolean isCompleted;
}
