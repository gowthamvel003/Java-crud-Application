package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.pojo.labourPOJO;  
public interface labourRepo extends JpaRepository<labourPOJO,Integer> {   
	
 /*   @Query(value= "SELECT id FROM  labourPOJO  WHERE name=? AND  adress=")
	 public List<labourPOJO> findBynameMatch(@Param("name") String  name );
	*/
	  @Query(value = "SELECT id FROM  labourPOJO  WHERE name=? AND  adress=?",
	      nativeQuery=true
	    )
	   public List<labourPOJO> findByTitle();

	Optional<labourPOJO> deleteById(int id);

	/*public Optional SearchByname(String name);*/

}