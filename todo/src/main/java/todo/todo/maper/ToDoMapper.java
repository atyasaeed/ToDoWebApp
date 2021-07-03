package todo.todo.maper;

import org.mapstruct.Mapper;
import todo.todo.dto.ToDoDto;
import todo.todo.model.Todo;
@Mapper
public interface ToDoMapper {

    ToDoDto toDto (Todo t);
}
