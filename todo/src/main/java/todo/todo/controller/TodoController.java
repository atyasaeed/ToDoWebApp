package todo.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import todo.todo.dto.ToDoDto;
import todo.todo.maper.ToDoMapper;
import todo.todo.model.Todo;
import todo.todo.service.TodoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/todo")

public class TodoController {
    @Autowired
    private TodoService todoService;
    @Autowired
    private ToDoMapper toDoMapper;

    @GetMapping("/findAll")
    public List<ToDoDto> findAll() {
        List<ToDoDto> dtos = new ArrayList<>();

        List<Todo> all = todoService.findAll();
        return toDoMapper.toDto(all);
//        all.forEach(i -> {
//            dtos.add(toDoMapper.toDto(i));
//        });


    }

    @GetMapping("/findBy/{id}")
    public Todo finById(@PathVariable("id") Integer id) {
        return todoService.findById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo save(@RequestBody Todo todo) {
//         new RequestEntity<Todo>(todoService.save(todo), HttpStatus.CREATED);
        return todoService.save(todo);

    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteById(@PathVariable("id") Integer id) {
        return todoService.deleteById(id);
    }

}
