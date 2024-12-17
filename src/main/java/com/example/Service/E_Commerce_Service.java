package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.E_Commerce_AddressDetails;
import com.example.model.E_Commerce_UserDetails;
import com.example.repo.E_Commerce_AddressDetails_Repository;
@Service
public class E_Commerce_Service {
	@Autowired
	E_Commerce_AddressDetails_Repository eCommerceRepo;
	
	public List<E_Commerce_AddressDetails> toGetAllDetailsFromDB(){
		return eCommerceRepo.findAll();
	}
	
	public String toAddCompleteUserDetailsToDB(E_Commerce_AddressDetails addressDetails) {
		eCommerceRepo.save(addressDetails);
		return "Data Stored Successfully";
	}
	
	public E_Commerce_AddressDetails getOneIdFromDB(Integer id) {
		return eCommerceRepo.findById(id).get();
	}
}
