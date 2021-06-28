package todo.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import todo.todo.model.Todo;
import todo.todo.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/findAll")
    public List<Todo> findAll() {

        return todoService.findAll();

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
