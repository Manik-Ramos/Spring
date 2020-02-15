package com.legitboss.mvc.formTags;

import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.legitboss.mvc.customValidator.CustomValidation;

public class Person {

	private String firstName;
	
	@NotNull(message="Lastname is required")
	@Size(min=1,message="Lastname is required")
	private String lastName;
	
	@NotNull(message="Please fill out the age")
	@Min(value=18,message="Should be a minimum of 18 years")
	@Max(value=22,message="Should be a maximum of 22 years")
	private Integer age;
	
	@CustomValidation(value="111",message="must start with 111")
	private String registerNumber;
	
	private String country;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="Not a valid Postcode, only 6 characters allowed")
	private String postCode;
	
	private String gender;
	
	private List<String> skills;
	
	public Person() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
}
