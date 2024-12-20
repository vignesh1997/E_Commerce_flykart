package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Cart;
import com.example.model.ECommerceUserDetails;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	//my query
//	@Query(value="select c.* From cart c where c.cart_id=:id1 and c.user_id=:id2", nativeQuery=true)
//	List<Cart> findByTwoIds(Integer id1, Integer id2);
	
	//from chtgpt 
	@Query(value = "SELECT c.* FROM cart c WHERE c.cart_id = :id1 AND c.user_id = :id2", nativeQuery = true)
	List<Cart> findByTwoIds(@Param("id1") Integer id1, @Param("id2") Integer id2);
}
