package com.sngular.formacion.shop.products;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sngular.formacion.shop.products.dto.Product;

public interface ProductsRepository extends MongoRepository<Product, String>{

}
