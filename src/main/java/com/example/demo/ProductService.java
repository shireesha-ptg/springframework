package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService 
{
	@Autowired
MyRepo repo;
 public List<Product> displayData()
 {
	return repo.findAll(); 
 }
 public void saveProduct(Product product) {
	 repo.save(product);
 }
 public Product getProd(long id)
 {
	 return repo.findById(id).get();
 }
 public void delete(long id)
 {
	repo.deleteById(id); 
 }
}
