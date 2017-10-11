package crudOpeeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class mainSport extends Sport {
	  Scanner scn=new Scanner(System.in);
	  List<Sport>sp= new ArrayList<Sport>();
	  String  cricketteam;
	  String batsman;
	  int ball;
public void Inseart(){
	  Sport spt=new Sport();
	
	  System.out.println("enter the  cricketteam");
	   cricketteam=scn.next();
	   spt.setCricketteam(cricketteam);
	   System.out.println("enter the batsman");
	   batsman=scn.next();
	   spt.setBatsman(batsman);
	   System.out.println("enthe the ball");
	   ball=scn.nextInt();
	   spt.setBall(ball);
	   sp.add(spt);
}
public void update(){
	System.out.println("update the Cricketteam");
    
    ListIterator<Sport>it=sp.listIterator();
    	
    	for(int i=0;i< sp.size();i++){
    		Sport sp=it.next(); 
    		
    		if(sp.getCricketteam().equals(cricketteam));
    		{
    			System.out.println("enter new cricket team");
    	    	String newcricketteam = scn.next();
    	    	System.out.println("enter new batsman");
    	    	String  newbatsman=scn.next();
    	    	System.out.println("enter the new ball");
    	    	int  newball=scn.nextInt();
    			sp.setCricketteam(newcricketteam);
    			sp.setBatsman(newbatsman);
    			sp.setBall(newball);
    		}
    		it.remove();
    		it.add(sp);
    	}	
    }

public void delete(){
	  mainSport mspt =new  mainSport();
	   System.out.println("Enter bike name whose record you want to Delete :");
	         cricketteam = scn.next();
	   Iterator<Sport> iter=sp.iterator();
	   while(iter.hasNext()){
	    if(iter.next().getCricketteam().equals(cricketteam));
	    {
	     iter.remove();
	     System.out.println("The team "+ cricketteam +" details is deleted");
	    }
     }
	   }

public void display(){
	
	int m=sp.size();
	for  (int j=0;j<m;j++ ){
		System.out.println("TEAM   :" + sp.get(j).getCricketteam() );
		System.out.println("Batsman:"+ sp.get(j).getBatsman());
		System.out.println("Run for ball:"+ sp.get(j).getBall());
	}
}

}
