package com.BuilderDesingPartten;

public class User {
	private final String userId;
	private final String userName;
	private final String emailId;
	
	private User(UserBuilder builder) {
		this.emailId=builder.emailId;
		this.userId=builder.userId;
		this.userName=builder.userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmailId() {
		return emailId;
	}
	//in this time i user the inner class
	static class UserBuilder{
		private  String userId;
		private  String userName;
		private  String emailId;
		
		private UserBuilder() {
			
		}
		
		public static UserBuilder getUserBuilder() {
			return new UserBuilder();
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}

}
