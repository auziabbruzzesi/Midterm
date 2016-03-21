/**
 * 
 */
package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

/**
 * @author Auzi
 *
 */
public class Course extends Semester {
	
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
///////////////////////////////////////////////////////////////////
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	public Course(){
		this.CourseID= UUID.randomUUID();
	}
	
	 

	public Course(int gradePoints2) {
		this.GradePoints = gradePoints2;
		// TODO Auto-generated constructor stub
	}
	public Course(String CourseName,int GradePoints,eMajor Major){
		this();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
	
	

	/////////////////////////////////////////////////////////////////////
//......................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		Major = major;
	}


/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////

}
