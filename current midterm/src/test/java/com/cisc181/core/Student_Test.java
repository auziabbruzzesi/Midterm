package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	//ArrayLists for tests:
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	private static ArrayList<Course> courseList = new ArrayList<Course>();
	private static ArrayList<Section> sectionList = new ArrayList<Section>();
	private static ArrayList<ArrayList> lstugr = new ArrayList<ArrayList>();//an arraylist to hold each student's grades





	@BeforeClass
	public static void setup(){
		UUID stu1id = UUID.randomUUID();
		UUID stu2id = UUID.randomUUID();
		UUID stu3id = UUID.randomUUID();
		UUID stu4id = UUID.randomUUID();
		UUID stu5id = UUID.randomUUID();
		UUID stu6id = UUID.randomUUID();
		UUID stu7id = UUID.randomUUID();
		UUID stu8id = UUID.randomUUID();
		UUID stu9id = UUID.randomUUID();
		UUID stu10id = UUID.randomUUID();
		//Student instantiation
		Student stu1 = new Student(stu1id); 
		studentList.add(stu1);
		Student stu2 = new Student(stu2id); 
		studentList.add(stu2);
		Student stu3 = new Student(stu3id);
		studentList.add(stu3);
		Student stu4 = new Student(stu4id);
		studentList.add(stu4);
		Student stu5 = new Student(stu5id);
		studentList.add(stu5);
		Student stu6 = new Student(stu6id);
		studentList.add(stu6);
		Student stu7 = new Student(stu7id);
		studentList.add(stu7);
		Student stu8 = new Student(stu8id);
		studentList.add(stu8);
		Student stu9 = new Student(stu9id);
		studentList.add(stu9);
		Student stu10 = new Student(stu10id);
		studentList.add(stu10);
		//each student has an arraylist of each enrollment(6 each)

		ArrayList<Enrollment> stu1g = new ArrayList<Enrollment>();
		lstugr.add(stu1g);
		ArrayList<Enrollment> stu2g = new ArrayList<Enrollment>();
		lstugr.add(stu2g);
		ArrayList<Enrollment> stu3g = new ArrayList<Enrollment>();
		lstugr.add(stu3g);
		ArrayList<Enrollment> stu4g = new ArrayList<Enrollment>();
		lstugr.add(stu4g);
		ArrayList<Enrollment> stu5g = new ArrayList<Enrollment>();
		lstugr.add(stu5g);
		ArrayList<Enrollment> stu6g = new ArrayList<Enrollment>();
		lstugr.add(stu6g);
		ArrayList<Enrollment> stu7g = new ArrayList<Enrollment>();
		lstugr.add(stu7g);
		ArrayList<Enrollment> stu8g = new ArrayList<Enrollment>();
		lstugr.add(stu8g);
		ArrayList<Enrollment> stu9g = new ArrayList<Enrollment>();
		lstugr.add(stu9g);
		ArrayList<Enrollment> stu10g = new ArrayList<Enrollment>();
		lstugr.add(stu10g);


		//Semester
		Semester Fall = new Semester();
		semesterList.add(Fall);
		Semester Spring = new Semester();
		semesterList.add(Spring);

		//Course


		Course bio = new Course("Biology",4,eMajor.CHEM);
		courseList.add(bio);
		Course chem = new Course("Chemistry",4,eMajor.CHEM);
		courseList.add(chem);
		Course math = new Course("Mathematics",3,eMajor.BUSINESS);
		courseList.add(math);

		//Add 2 sections for each course, one in each semester
		for(Semester s : semesterList){
			for (Course c: courseList){
 
				Section section = new Section(c.getGradePoints());
				sectionList.add(section);

			}

		}
	}

 

	@Test
	public void StudentTests(){




		for(int i = 0; i<studentList.size();i++){ //for each student
		

			for(Section section : sectionList){//for each section that a student is enrolled in
				Enrollment en  = new Enrollment(studentList.get(i).getStudentID(),section.getSectionID());//generate a new instance of enrollment
			
				/*NOTE FOR PROFESSOR GIBBONS: 
				below is a loop that i made to assign random grades to students as 
				instances of Enrollment were created. Since it's random, the results were different every
				time (impossible to test)
				instead of rewriting everything, I used a mod to assign grades/
				
				
				/*	Random rand = new Random();
				int randomgrade = rand.nextInt((100-1)+1)+1;//assign a random grade from 1-100

				System.out.print(randomgrade+"\n");*/
				
				
				
				if((i%3) == 0){
					en.setGrade(3.5);
				}
				else if(((i%2)==0)&& ((i%4)!=0)){
					en.setGrade(2.3);
					
				}
				else{
					en.setGrade(2.8);
				}
				lstugr.get(i).add(en);//add each new enrollment to listofstudentgrades(lstugr) at the proper index
				
				} 

			//Calculate the GPA and AVG grade
			double sum_grades1 = 0;
			double sum_credits1 = 0;
			double sum_GWA1 = 0;
			for(int f= 0; f<lstugr.get(0).size(); f++){
				sum_grades1 += ((Enrollment) lstugr.get(0).get(f)).getGrade();//a sum of all grades in class
				sum_credits1 += (sectionList.get(f).getGradePoints());//total number of credits taken
				sum_GWA1 += ((sectionList.get(f).getGradePoints())*((Enrollment) lstugr.get(0).get(f)).getGrade()) ;
				
				
		}
			double GPA1 = sum_GWA1/sum_credits1;
			double avg_grade1 = sum_grades1/lstugr.get(0).size();
			
			
			
			assertEquals(GPA1,3.5,0);
			assertEquals(avg_grade1,3.5,0);
			
			
		}
		
		
			
		}
	@Test
	public void ChangeMajor(){
		studentList.get(0).setMajor(eMajor.CHEM);
		assertTrue(studentList.get(0).getMajor()==eMajor.CHEM);
		studentList.get(0).setMajor(eMajor.PHYSICS);
		assertTrue(studentList.get(0).getMajor()==eMajor.PHYSICS);
	
	}
	
	
			

			
		

	



		
		
		
		
		
		
	
		
	}

 


