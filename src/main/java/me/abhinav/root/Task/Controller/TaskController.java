package me.abhinav.root.Task.Controller;

import me.abhinav.root.Task.Dto.ResponseTaskDto;
import me.abhinav.root.Task.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @GetMapping("/getall")
    public List<ResponseTaskDto> get_all_tasks() throws ParseException {
        TaskService.add_new_task_service();
        return TaskService.get_all_task_service();
    }
    @GetMapping("/getbyid/{id}")
    public ResponseTaskDto get_task_by_id(@PathVariable("id") Integer id) throws ParseException {
        TaskService.add_new_task_service();
        ResponseTaskDto responseTaskDto = TaskService.get_task_by_id_service(id);
        //return "Task not found with id " + id;
        return responseTaskDto;
    }
}
