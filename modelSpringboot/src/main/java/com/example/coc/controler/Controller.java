package com.example.coc.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.coc.pojo.farmerPOJO;
import com.example.coc.repository.farmerRepo;
import com.example.coc.service.farmerService;

@RestController
public class Controller{
	    @Autowired  
	    private farmerService farmer;
	    @Autowired
	    private farmerRepo fr;
	    @RequestMapping("/")  
	    public List<farmerPOJO> getAllUser(){  
	     return farmer.getAllUsers();   
	    }
	    @RequestMapping(value="/add-user", method=RequestMethod.POST)     
	    public void addUser(@RequestBody farmerPOJO id){  
	      farmer.addUser(id);   
	    }     
	   @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
	    
	    public Optional<farmerPOJO> getUser(@PathVariable int id){  
	        return farmer.getUser(id);  
	    }    
	    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)  
	    public void updateUser(@RequestBody farmerPOJO id){  
	      fr.save(id);
	     }
	    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)  
	    public Optional<farmerPOJO> delUser(@PathVariable int id){  
	      return fr.deleteById(id);  
	    }
	    @RequestMapping (value="/user/",method=RequestMethod.GET)
	    public  ArrayList<farmerPOJO>  searchUser(){
	   	 return (ArrayList<farmerPOJO>) fr.findAll();
	  }	 
}
	  