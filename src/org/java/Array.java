package org.java;

public class Array {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		int sum=0;
		int l=a.length;
		System.out.println("No of values in an array:"+l);
		for (int i = 0; i < l; i++) {
			
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}

}
