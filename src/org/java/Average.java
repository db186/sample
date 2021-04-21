package org.java;

public class Average {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }, avg;
		int sum = 0;
		int l = a.length;
		System.out.println("Average:" + l);
		for (int i = 0; i < l; i++) {
			sum = sum + a[i];
		}
		avg = sum / l;
		System.out.println(avg);
	}

}
