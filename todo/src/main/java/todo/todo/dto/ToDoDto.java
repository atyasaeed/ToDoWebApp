package todo.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {
    private Integer id;
    private String taskName;
    private LocalDate date;
    private String description;
    private boolean isDone;
    private ProductDto product;
}
