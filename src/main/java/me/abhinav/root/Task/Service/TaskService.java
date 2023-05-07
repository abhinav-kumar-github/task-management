package me.abhinav.root.Task.Service;

import me.abhinav.root.Task.Dto.ResponseTaskDto;
import me.abhinav.root.Task.Model.Task;
import me.abhinav.root.Task.Repository.TaskRepo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaskService {
    public static List<ResponseTaskDto> get_all_task_service() {
        List<ResponseTaskDto> task_list = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : TaskRepo.task_map.entrySet()) {
            task_list.add(new ResponseTaskDto(entry.getValue().getId(), entry.getValue().getName(),
                    entry.getValue().getDueDate(), entry.getValue().getIsCompleted()));
        }
        return task_list;
    }

    public static ResponseTaskDto get_task_by_id_service(Integer searchId) {
        for (Map.Entry<Integer, Task> entry : TaskRepo.task_map.entrySet()) {
            if(entry.getValue().getId() == searchId) {
                return new ResponseTaskDto(entry.getValue().getId(), entry.getValue().getName(),
                        entry.getValue().getDueDate(), entry.getValue().getIsCompleted());
            }
        }
        return null;
    }

    public static void add_new_task_service() throws ParseException {
        TaskRepo.task_map.put(1, new Task(1, "task1", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), false));
        TaskRepo.task_map.put(2, new Task(2, "task2", new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2022"), false));
        TaskRepo.task_map.put(3, new Task(3, "task3", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/2022"), false));
    }
}
