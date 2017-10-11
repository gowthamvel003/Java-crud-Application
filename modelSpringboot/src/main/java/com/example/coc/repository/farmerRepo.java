package com.example.coc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.coc.pojo.farmerPOJO;

public  interface farmerRepo  extends  JpaRepository <farmerPOJO, Integer> {
		
/*	  @Query(value = "SELECT id FROM  labourPOJO  WHERE name=? AND  adress=?",  
		      nativeQuery=true
		    )	
	  public List<farmerPOJO> findByTitle();
*/
	Optional<farmerPOJO> deleteById(int id);

//	Optional<farmerPOJO> findById(int id);
}