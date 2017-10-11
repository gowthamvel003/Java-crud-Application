package com.example.coc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coc.pojo.farmerPOJO;
import com.example.coc.repository.farmerRepo;

@Service  
	public class farmerService {  
	    @Autowired  
	    private farmerRepo repo;  
	      public List<farmerPOJO> getAllUsers(){  
	        List<farmerPOJO>userRecords = new ArrayList<>();  
	        repo.findAll().forEach(userRecords::add);  
	        return userRecords;  
	    }  
	    public Optional<farmerPOJO> getUser(int id){  
	        return repo.findById(id); 
	    }  
	    public void addUser(farmerPOJO userRecord){  
	        repo.save(userRecord);  
	    }  
	    public void delete(int id){  
	        repo.deleteById(id);  
	    }
		 /*public void Search(String name){
			repo.SearchByname (name);
		 }*/
	}  

