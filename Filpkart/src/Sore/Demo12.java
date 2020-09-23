package Sore;

import java.util.Scanner;

public class Demo12 {
	
	  public static void main(String [] xyz)
	   {  
	     Scanner scr=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=scr.nextInt();
		System.out.println("enter the value of b");
		int b=scr.nextInt();
		System.out.println("enter the value of c");
		int c=scr.nextInt();
		System.out.println("befor swapping");
		System.out.println("swapping start here");
		a=b;
		b=c;
		c=a;
		
		
		System.out.println("after  swapping");
		System.out.println(a);
	        System.out.println(b);
	 System.out.println(c);
	 }
	  
}
		



