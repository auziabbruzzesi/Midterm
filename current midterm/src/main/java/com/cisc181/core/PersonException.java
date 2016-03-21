/**
 * 
 */
package com.cisc181.core;


/**
 * @author Auzi
 *
 */
public class PersonException extends Exception {
	
	private Person p;
	
	public PersonException(Person p,String message){
		super(message);
		this.p = p;
		
	} 
	public Person getP(){
		return p;
	}


	
}