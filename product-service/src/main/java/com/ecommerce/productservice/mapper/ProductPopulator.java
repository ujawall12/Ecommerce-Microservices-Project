package com.ecommerce.productservice.mapper;

import com.ecommerce.productservice.dto.ProductRequest;
import com.ecommerce.productservice.dto.ProductResponse;
import com.ecommerce.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface ProductPopulator {

    ProductResponse populate(Product product);
    Product populate(ProductRequest productRequest);
}
