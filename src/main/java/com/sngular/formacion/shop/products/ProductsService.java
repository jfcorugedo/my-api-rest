package com.sngular.formacion.shop.products;

import com.sngular.formacion.shop.products.dto.Product;

public interface ProductsService {

	Product create(Product product);

	Product get(String id);

}
