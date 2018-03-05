/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program creates an array of students
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Grades {
	ONE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	ELEVEN,
	TWELVE,
	JK,
	SK;
}

class Student {
	//ADT tht defines a student
	public String firstName;
	public String middleName;
	public String lastName;
	public String birthDate;
	public Grades grade;
	public String fullName = (firstName+" "+middleName+" "+lastName);
	
	protected Student(String firstName, String middleName, String lastName,
					  String birthDate, Grades grade) {
		//Default constructor for a student
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.grade = grade;
	}
}

public class StudentArray {
	
	public static void main(String[] args) throws IOException {
		//Fill an array with students
		
		boolean fullClassroom = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		
		do {
			//get fields required to create student
			System.out.println("What is the student's first name?");
			String firstName = reader.readLine();
			
		} while(!fullClassroom);
	}
}