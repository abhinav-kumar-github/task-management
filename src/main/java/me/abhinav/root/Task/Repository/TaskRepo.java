package me.abhinav.root.Task.Repository;

import me.abhinav.root.Task.Dto.NewTaskDto;
import me.abhinav.root.Task.Model.Task;

import java.util.Map;
import java.util.HashMap;

public class TaskRepo {
    public static Map<Integer, Task> task_map = new HashMap<>();
    Integer next_task_id = 0;

    public void add_task(NewTaskDto new_task_dto) {
        Task newTask = new Task(next_task_id++, new_task_dto.getName(), new_task_dto.getDueDate(), false);
        TaskRepo.task_map.put(newTask.getId(), newTask);
    }
}
