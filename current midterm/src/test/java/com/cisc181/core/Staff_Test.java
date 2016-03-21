package com.cisc181.core;
import com.cisc181.core.*;
import com.cisc181.eNums.eTitle;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	ArrayList<Staff> StaffList = new ArrayList<Staff>();
	

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	@Test
	public void salaryavg(){
		//Calculate the Average Salaries
		StaffList.add(new Staff(null, null, null, null, null, null, null, null, 0, 45000, null, null));
		StaffList.add(new Staff(null, null, null, null, null, null, null, null, 0, 47500, null, null));
		StaffList.add(new Staff(null, null, null, null, null, null, null, null, 0, 63000, null, null));
		StaffList.add(new Staff(null, null, null, null, null, null, null, null, 0, 30000, null, null));
		StaffList.add(new Staff(null, null, null, null, null, null, null, null, 0, 180000, null, null));
		
		int sum = 0;
		for(int i=0;i<StaffList.size();i++){ 
			sum += StaffList.get(i).getSalary();
		}
		
		assertEquals(sum/StaffList.size(),73100,0);
	}  
	
	@Test(expected = PersonException.class)
	public void TestInvalidPN() throws ParseException,PersonException{
		//Testing Exception when invalid phone number is given
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		
		Date birthday = sdf.parse("10/16/1880");//Setting the birthday format
		 
		
		
		Staff st = new Staff("John","M","Costa",birthday, "some Address","5", "john@hotmail.gov", null, 6, 45000, null, eTitle.MR);
		
		//try 
		//{
		st.PrintAge();
		//}
		//catch(PersonException pe){
			//System.out.println("PERSON EXCEPTION " + pe.getMessage());
		//}
		try{
			st.printPhoneNumber();
		}
		catch(PersonException pe){
			System.out.println(pe.getMessage());
		}
		catch(Exception e){
			
		}
		
		
	}
	
} 
