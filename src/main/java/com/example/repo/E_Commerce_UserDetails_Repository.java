package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ECommerceUserDetails;
@Repository
public interface E_Commerce_UserDetails_Repository extends JpaRepository<ECommerceUserDetails, Integer> {

}
