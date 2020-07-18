package com.syntax.class23;

public class UserClass {

	String name;
	int mobileNumber;

	public UserClass(String name, int mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}

class UserInfo extends UserClass {
	String userAddress;

	public UserInfo(String name, int mobileNumber, String userAddress) {
		super(name, mobileNumber);
		this.userAddress = userAddress;
	}

	void userDetails() {
		System.out.println(
				"User name is " + name + ", his mobile number is " + mobileNumber + " and address " + userAddress);
	}
}
