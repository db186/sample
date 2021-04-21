package org.exam;

import org.test.mobileDetails;

public class mobileOwner {

	private void mobownname() {
		System.out.println("Mobile owner name is jack");
		

	}
	private void mobownnum() {
		System.out.println("Mobile owner number is 9876543210");

	}
	private void mobownloc() {
		System.out.println("Mobile owner location is usa");

	}
	private void mobownveh() {
		System.out.println("Mobile owner vehicle is car");
	}
	public static void main(String[] args) {
		mobileOwner mo = new mobileOwner();
		mobileDetails md = new mobileDetails();
		md.mobNam();
		md.mobPri();
		mo.mobownloc();
		mo.mobownname();
		mo.mobownnum();
		mo.mobownveh();
	}
}
