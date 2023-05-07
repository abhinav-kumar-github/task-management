package me.abhinav.root.Task.Controller;

import me.abhinav.root.Task.Dto.NewTaskDto;
import me.abhinav.root.Task.Dto.ResponseTaskDto;
import me.abhinav.root.Task.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @GetMapping("/getall")
    public List<ResponseTaskDto> get_all_tasks() throws ParseException {
        TaskService.add_new_task_service_dummy();
        return TaskService.get_all_task_service();
    }
    @GetMapping("/getbyid/{id}")
    public ResponseTaskDto get_task_by_id(@PathVariable("id") Integer id) throws ParseException {
        TaskService.add_new_task_service_dummy();
        ResponseTaskDto responseTaskDto = TaskService.get_task_by_id_service(id);
        //return "Task not found with id " + id;
        return responseTaskDto;
    }

    @PostMapping("/add/{name}")
    //public ResponseTaskDto add_new_task(@PathVariable("name") String name, @PathVariable("duedate") String duedate) throws ParseException {
    public ResponseTaskDto add_new_task(@PathVariable("name") String name) throws ParseException {
        ResponseTaskDto responseTaskDto = TaskService.add_new_task_service(new NewTaskDto(name,
                new SimpleDateFormat("dd/MM/yyyy").parse("22/12/2222")));
        //return "Task not found with id " + id;
        return responseTaskDto;
    }
}
