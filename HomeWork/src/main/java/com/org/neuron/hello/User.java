package com.org.neuron.hello;

public class User {

	private String username;
	private String email;
	private String phone;
	private Profile profile;
	
	//TO Remember - This is required when you autowire by constructor 
	/*public User(Profile profile){
		this.profile = profile;
	}
	*/
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
