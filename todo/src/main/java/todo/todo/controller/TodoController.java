package todo.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todo.todo.model.Todo;
import todo.todo.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping(name = "/finAll")
    public List<Todo> findAll() {

        return todoService.findAll();

    }

    @GetMapping(name = "/findBy/{id}")
    public Todo finById(@PathVariable("id") Integer id) {
        return todoService.findById(id);
    }

    @PostMapping(name = "/save")
    public Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @DeleteMapping(name = "/delete/{id}")
    public boolean deleteById(@PathVariable("id") Integer id) {
        return todoService.deleteById(id);
    }

}
