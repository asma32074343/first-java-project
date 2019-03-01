package com.axcel.example;

import java.util.Scanner;

public class Pilandrom {

	public static void main(String[] args) {
		 int arraylen =5;
		   int[]testarray=new int [arraylen];
		   Scanner sc=new Scanner (System.in);
		   for (int i=0;i<arraylen; i++ ) {
			   System.out.print("please entre an number "+ i);
			   //call please entre an number 1=a
			   testarray[i]=sc.nextInt();
		   }
		   int counter =0;
		   while (counter<arraylen)
		   {
			   System.out.println(testarray[counter]);
			   counter++;
		   }
		   if ((int i=0;i<arraylen; i++)==(int i=0;i<arraylen; i--))
		   {
			   System.out.println ("the number is paladrom");

	}
		   else
		   {
			   System.out.println ("the number is not paladrom");
}
	}
}
//enter the number first
//called the array from 1 to 5 
//then from 5 to1
//compare them if they equal
