package com.axcel.example;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * first,we get our number 
		 * then,we compare them to eatch other 
		 * one by one if it is semmler with take it out 
		 * do like than untill the end
		 */
		int[] asma = {6,7,8};
		for(int i=0;i<asma.length;i++) {
			for(int j=i;j<asma.length;i++) {
				int temp=asma[j];
				asma[j]=asma[i];
				asma[i]=temp;
			}
	}

}
}
