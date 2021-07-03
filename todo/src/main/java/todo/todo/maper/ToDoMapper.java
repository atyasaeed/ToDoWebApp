package todo.todo.maper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import todo.todo.dto.ToDoDto;
import todo.todo.model.Todo;

import javax.xml.transform.Source;
import java.util.List;

@Mapper(componentModel = "spring",uses={ProductMapper.class})
public interface ToDoMapper {
    @Mapping(source = "task", target = "taskName")
    ToDoDto toDto(Todo t);

    @Mapping(source = "task", target = "taskName")
    List<ToDoDto> toDto(List<Todo> t);

    @Mapping(source = "taskName", target = "task")
    Todo toEntity(ToDoDto t);

    Todo update(ToDoDto dto, @MappingTarget Todo entity);

}
