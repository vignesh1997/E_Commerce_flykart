package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ProductCategoryRelationship;
import com.example.repo.ProductCategoryRelationShipRepository;
@Service
public class ProductCategoryRelationship_Service {

	@Autowired
	ProductCategoryRelationShipRepository productCategoryRelationRepo;
	
	public List<ProductCategoryRelationship> toGetAllDetailsFromProductCategoryRelationship(){
		return productCategoryRelationRepo.findAll();
	}
	
	public String addDataToProductCategoryRelationshipTable(ProductCategoryRelationship productCategory) {
		productCategoryRelationRepo.save(productCategory);
		return "data stored successfully in DB";
	}
	
	public String deleteOneIDFromproductCategoryRelationshipTable(Integer productCategoryRelationshipId) {
		productCategoryRelationRepo.deleteById(productCategoryRelationshipId);
		return "data deleted successfully";
	}
}
