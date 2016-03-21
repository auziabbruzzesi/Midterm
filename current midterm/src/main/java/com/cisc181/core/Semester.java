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
public class Semester extends Student{
	
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
////////////////////////////////////////////////////////////////////
	
	private UUID SemesterID;
	private Date StartDate,EndDate;
	
	
	
/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	public Semester(){
		this.SemesterID = UUID.randomUUID();
	}
	public Semester(Date StartDate, Date EndDate){
		this();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	
	

/////////////////////////////////////////////////////////////////////
//......................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	
	public UUID getSemesterID() {
		return SemesterID;
	}



	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}



	public Date getStartDate() {
		return StartDate;
	}



	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}



	public Date getEndDate() {
		return EndDate;
	}



	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	

/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////

}
