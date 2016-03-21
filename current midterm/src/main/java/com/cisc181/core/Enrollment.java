/**
 * 
 */
package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

/**
 * @author Auzi
 *
 */
public class Enrollment extends Section {

/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
////////////////////////////////////////////////////////////////////

	private UUID EnrollmentID;
	private double Grade;
/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	public Enrollment(){ 
		
		this.EnrollmentID = UUID.randomUUID();
	}
	public Enrollment(UUID StudentID,UUID SectionID){
		super();
		SectionID = this.getSectionID();
		StudentID = this.getStudentID();
		this.EnrollmentID = UUID.randomUUID();
		
		
	}
	public Enrollment(double Grade){
		this();
		this.Grade = Grade; 
	}
	

/////////////////////////////////////////////////////////////////////
//......................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}

/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////

}
