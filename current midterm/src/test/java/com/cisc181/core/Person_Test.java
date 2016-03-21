///**
// * 
// */
//package com.cisc181.core;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.junit.*;
//
///**
// * @author Auzi
// *
// */
//
//public class Person_Test { 
//	
//	@Test
//	public void Testex() throws PersonException{
//		Employee e = new Employee("Joe","","Smith",null, "here", "44", null, null, 0, null);
//		
//		try{
//		e.printPhoneNumber();
//		}
//		catch(PersonException p){
//			System.out.println(p.getMessage());
//			
//			
//		}
//	}
//	
//
//	@Test
//	public void textex2()throws PersonException{
//		Student s = new Student("auzi", null, null, null, null, null, "(610)-322-5693", null);
//		
//		try{
//			s.printPhoneNumber();
//		}
//		catch(PersonException p){
//			
//		}
//	}
//	@Test
//	public void regexTest(){
//		String txt="(000)-000-000";
//		String txt0 = "(610)-444-9876";
//		String txt1 = "0";
// 
//	    String re1="(\\()";	// Any Single Character 1
//	    String re2="(\\d+)";	// Integer Number 1
//	    String re3="(\\))";	// Any Single Character 2
//	    String re4="(-)";	// Any Single Character 3
//	    String re5="(\\d+)";	// Integer Number 2
//	    String re6="(-)";	// Any Single Character 4
//	    String re7="(\\d+)";	// Integer Number 3
//	    String regex = (re1+re2+re3+re4+re5+re6+re7);
//	    
//
//	    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
//	    System.out.println(p);
//	    Matcher m = p.matcher(txt);
//	    System.out.print(m);
//	    if(Pattern.matches(regex, txt)){
//	    	System.out.println("\n" + "good"); 
//	    }
//	    else{
//	    	System.out.println(txt + " is not valid");
//	    }
//	    if(Pattern.matches(regex, txt1)){
//	    	System.out.println("\n"+"good");
//	    }
//	    else{
//	    	System.out.print(txt1 + " is not valid");
//	    }
//	    if(Pattern.matches(regex, txt0)){
//	    	System.out.println("\n"+"good");
//	    }
//	    else{
//	    	System.out.print(txt0 + " is not valid");
//	    }
//	    //Pattern.matches(p, txt)
//	    
//	}
//
//	
//}