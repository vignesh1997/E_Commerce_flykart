package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.E_Commerce_AddressDetails;
@Repository
public interface E_Commerce_AddressDetails_Repository extends JpaRepository<E_Commerce_AddressDetails, Integer> {

}
