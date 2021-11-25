package com.technoelevate.scannerclass;

import java.util.Scanner;

public class Sre {
	
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr =new int[5];
		System.out.println("Enter the value");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=scan.nextInt();
		}
		System.out.println("MY ARRAY NUMBERS AREE");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		boolean flag=true;
		while(flag) {
			flag=false;
			int temp=0;
			for(int i=0;i<arr.length-1;i++) {
				if (arr[i]<arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				flag=true;
				}
			}
			
    }
 System.out.println("MY SORTED ARRAY");
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }
    	
	}

}
