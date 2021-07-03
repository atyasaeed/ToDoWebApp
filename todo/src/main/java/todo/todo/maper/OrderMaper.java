package todo.todo.maper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import todo.todo.dto.OrderDto;
import todo.todo.model.Order;

@Mapper
public interface OrderMaper {
//@Mapping(source = "orderId",target = "id")
//@Mapping(source = "orderName",target = "name")
    OrderDto mapToDto(Order order);

}
