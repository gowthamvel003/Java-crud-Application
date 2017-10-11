package crudOpeeration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainfunSport {
	
  public static void main(String []args){
	  Scanner scn= new Scanner(System.in);
	  mainSport mspt=new  mainSport();
	  Sport  spt=new Sport();
	  List<Sport>spo=new ArrayList<Sport>();
	  while(true){
	  System.out.println("Choose the operation you want to perform ");
	   System.out.println("Enter 1 for inseart");
      System.out.println("Enter 2 for update");
      System.out.println("Enter 3 for delete");
      System.out.println("Enter 4 for display");  
      System.out.println("Enter 5 to Exit");
      int oppo=scn.nextInt();
      switch(oppo){
      case 1:
    	//  System.out.println("inseart:");
    	mspt.Inseart();
    	break;
      case 2:
    	  mspt.update();
    	  break;
      case 3:
    	  mspt.delete();
    	  break;
      case 4:
    	  mspt.display();
    	  break;
      case 5:
    	  System.exit(0);
     default:
    	  System.out.println(" plz enter the invodi");
      }
  } }
}
