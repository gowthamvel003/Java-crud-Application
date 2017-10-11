package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.*;
import com.example.demo.repository.labourRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class labourService {  
    @Autowired  
    private labourRepo repo;  
      public List<labourPOJO> getAllUsers(){  
        List<labourPOJO>userRecords = new ArrayList<>();  
        repo.findAll().forEach(userRecords::add);  
        return userRecords;  
    }  
    public Optional<labourPOJO> getUser(int id){  
        return repo.findById(id); 
    }  
    public void addUser(labourPOJO userRecord){  
        repo.save(userRecord);  
    }  
    public void delete(int id){  
        repo.deleteById(id);  
    }
	 /*public void Search(String name){
		repo.SearchByname (name);
	 }*/
}  