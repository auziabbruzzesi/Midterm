package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * AUSTIN ABBRUZZESI MIDTERM 1
 */
public abstract class Person implements java.io.Serializable {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName; 
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB){
		this.DOB = DOB;
		
		
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	
	}

	public String getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email){
	
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.setDOB(DOB);
		this.address = Address;
		this.setPhone(Phone_number);
		this.email_address = Email;
		
		
		
		}
	public void printPhoneNumber() throws PersonException{//CHECKS PHONE NUMBER FORMAT
		

	    String re1="(\\()";	// Any Single Character 1
	    String re2="(\\d+)";	// Integer Number 1
	    String re3="(\\))";	// Any Single Character 2
	    String re4="(-)";	// Any Single Character 3
	    String re5="(\\d+)";	// Integer Number 2
	    String re6="(-)";	// Any Single Character 4
	    String re7="(\\d+)";	// Integer Number 3
	    String regex = (re1+re2+re3+re4+re5+re6+re7);//THE DESIRED PHONE-NUMBER FORMAT    
		
		String pn = this.getPhone();//Sets pn equal to the phonenum of this instance
		if (!Pattern.matches(regex, pn)){//if the pattern of pn does not match regex, throw new exc.
			throw new PersonException(this, "PERSON EXCEPTION " + pn + " is not a valid phone number" );
		
		} 
		else{
			System.out.println(pn);  
		} 
	}
	

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		
		System.out.println(this.DOB);
	}

	public int PrintAge()throws PersonException {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		//THROW EXCEPTION IF OLDER THAN 100
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if (age >= 100){
			throw new PersonException(this,"you're not actually that old");
		}

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH)) 
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}