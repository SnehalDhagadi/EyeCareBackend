package com.example.demo.entities;

public class User {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String phoneNumber;
	private String address;
	private String password;
	private String role;
	
	public User(long id, String firstname, String lastname, String email, String gender, String phoneNumber,
			String address, String password, String role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.role=role;


	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
 
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getpassword() {
		return password;
	}

	public void setPassword(String address) {
		this.password = password;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", address=" + address + ",password="+password+",role="+role+"]";
	}
	
	
}
