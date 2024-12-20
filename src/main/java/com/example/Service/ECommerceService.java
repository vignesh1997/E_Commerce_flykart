package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ECommerceAddressDetails;
import com.example.model.ECommerceUserDetails;
import com.example.repo.E_Commerce_AddressDetails_Repository;
@Service
public class ECommerceService {
	@Autowired
	E_Commerce_AddressDetails_Repository eCommerceRepo;
	
	public List<ECommerceAddressDetails> toGetAllDetailsFromDB(){
		return eCommerceRepo.findAll();
	}
	
	public String toAddCompleteUserDetailsToDB(ECommerceAddressDetails addressDetails) {
		eCommerceRepo.save(addressDetails);
		return "Data Stored Successfully";
	}
	
	public ECommerceAddressDetails getOneIdFromDB(Integer id) {
		return eCommerceRepo.findById(id).get();
	}
}
