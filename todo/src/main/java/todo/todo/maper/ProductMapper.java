package todo.todo.maper;

import org.mapstruct.Mapper;
import todo.todo.dto.ProductDto;
import todo.todo.model.Product;

@Mapper()
public interface ProductMapper {

    ProductDto mapToDto(Product Product);

    Product mapToEntity(ProductDto productDto);
}
