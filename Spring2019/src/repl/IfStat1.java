package repl;

import java.util.*;
class IfStat1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("---------------");
    System.out.println("select an option:");
    System.out.println("1) option 1");
    System.out.println("2) option 2");
    System.out.println("3) option 3");
    System.out.println("---------------");
    
    int choice = scan.nextInt();

    if(choice ==1) {
    	System.out.println("user selected 1");
    }else if(choice ==2){
    	
    	System.out.println("user selected 2");
    }
    	else {
    		System.out.println("user selected 3");
    	}
    	}
    
    	
    
    //your code here
    
  }
  