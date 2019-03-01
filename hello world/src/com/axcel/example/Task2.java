package com.axcel.example;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * first,we get our number 
		 * then,we compare them to eatch other 
		 * one by one if it is semmler with take it out 
		 * do like than untill the end
		 */
		int[] asma = {5,8,6,1,2,4,3};
		for(int i=0;i<asma.length;i++) {
			for(int j=i;j<asma.length;j++) {
				if (asma[i]>asma[j]) {
				int temp=asma[j];
				asma[j]=asma[i];
				asma[i]=temp;
				}	
			}
	}
		
		for (int i=0;i<asma.length;i++ )  {
		System.out.println(asma[i]);
		}
	}

}
