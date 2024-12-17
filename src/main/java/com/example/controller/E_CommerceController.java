package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.E_Commerce_Service;
import com.example.Service.ProductCategoryRelationship_Service;
import com.example.model.E_Commerce_AddressDetails;
import com.example.model.ProductCategoryRelationship;
@RestController
public class E_CommerceController {

	@Autowired
	E_Commerce_Service eCommerceService;
	
	@Autowired
	ProductCategoryRelationship_Service productCategoryRelationship_Service;
	@GetMapping("/getAllDetailsFromDB")
	public List<E_Commerce_AddressDetails> toGetFullDetailsofCustomerFromDB(){
		return eCommerceService.toGetAllDetailsFromDB();
	}
	@PostMapping("/saveAddressAndUserDetailsToDB")
	public String toStoreDataInDB(@RequestBody E_Commerce_AddressDetails addressDetails) {
		return eCommerceService.toAddCompleteUserDetailsToDB(addressDetails);
	}
	@GetMapping("/getDataById")
	public E_Commerce_AddressDetails getByID(@RequestParam String id) {
		return eCommerceService.getOneIdFromDB(Integer.parseInt(id));
	}
	@GetMapping("/getAllProductCategoryRelationshipTable")
	public List<ProductCategoryRelationship> getAllProductCategoryRelationshipDataFromDB(){
		return productCategoryRelationship_Service.toGetAllDetailsFromProductCategoryRelationship();
	}
	@PostMapping("/addDataToProductCategoryRelationshipTable")
	public String toAddProductCategoryRelationshipDataToDB(@RequestBody ProductCategoryRelationship productCategory) {
		return productCategoryRelationship_Service.addDataToProductCategoryRelationshipTable(productCategory);
	}
	
	@PostMapping("/updateDataProductCategoryRelationshipTable")
	public String updateDataProductCategoryRelationshipTableInDB(@RequestBody ProductCategoryRelationship productCategory) {
		productCategoryRelationship_Service.addDataToProductCategoryRelationshipTable(productCategory);
		return "data updated successfully";
	}
	@PostMapping("/deleteoneDataFromProductCategoryRelationshipTable")
	public String deleteDataFromProductCategoryRelationshipTable(@RequestParam String id) {
		return productCategoryRelationship_Service.deleteOneIDFromproductCategoryRelationshipTable(Integer.parseInt(id));
	}
}
