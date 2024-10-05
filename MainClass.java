package com.BuilderDesingPartten;

public class MainClass {

	public static void main(String[] args) {
		User user1=User.UserBuilder
				.getUserBuilder()
				.setEmailId("spradhan@gmail.com")
				.setUserId("user123")
				.setUserName("santosh")
				.build();
		
		System.out.println(user1.getEmailId());
		
	}

}
