package com.sngular.formacion.shop.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sngular.formacion.shop.products.dto.Product;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public Product create(Product product) {
		
		return productsRepository.save(product);
	}
	
	@Override
	public Product get(String id) {
		
		return productsRepository.findOne(id);
	}
}
