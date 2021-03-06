package todo.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.todo.model.Todo;
import todo.todo.repository.TodoRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        try {

            return todoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public Todo save(Todo todo) {
        try {
//            todo.setDate(LocalDate.now());
            return todoRepository.save(todo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public boolean deleteById(Integer id) {
        try {
            todoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public Todo findById(Integer id) {
        try {
            Optional<Todo> byId = todoRepository.findById(id);
            if (byId.isPresent()) {
                return byId.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
