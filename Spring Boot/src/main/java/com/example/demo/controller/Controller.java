package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.labourPOJO;
import com.example.demo.repository.labourRepo;
import com.example.demo.service.labourService;

import java.util.ArrayList;
import java.util.List;  

@RestController  
public class Controller {  
    @Autowired  
    private labourService labService;
    @Autowired
    private labourRepo repo;
    @RequestMapping("/")  
    public List<labourPOJO> getAllUser(){  
     return labService.getAllUsers();   
    }
    @RequestMapping(value="/add-user", method=RequestMethod.POST)     
    public void addUser(@RequestBody labourPOJO id){  
      labService.addUser(id);   
    }     
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public Optional<labourPOJO> getUser(@PathVariable int id){  
        return labService.getUser(id);  
    }  
    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)  
    public void updateUser(@RequestBody labourPOJO id){  
      repo.save(id);
     }
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)  
    public Optional<labourPOJO> delUser(@PathVariable int id){  
      return repo.deleteById(id);  
    }
    @RequestMapping (value="/user/",method=RequestMethod.GET)
    public  ArrayList<labourPOJO>  searchUser(){
   	 return (ArrayList<labourPOJO>) repo.findAll();
   	 
  }
    
}
    