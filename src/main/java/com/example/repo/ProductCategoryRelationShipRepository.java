package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ProductCategoryRelationship;
@Repository
public interface ProductCategoryRelationShipRepository extends JpaRepository<ProductCategoryRelationship, Integer> {

}
