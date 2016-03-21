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
public class Section extends Course {
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
///////////////////////////////////////////////////////////////////
	
	private UUID SectionID;
	private int RoomID;
	

	
/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	public Section(){
		
	}
	public Section(int GradePoints){
		
		super(GradePoints);
		this.SectionID = UUID.randomUUID();
		
	}
	public Section(int RoomID,String str){
		this();
		this.RoomID = RoomID;
	}


/////////////////////////////////////////////////////////////////////
//......................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////

}
