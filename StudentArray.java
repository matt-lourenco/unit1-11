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

class Student {
	//ADT tht defines a student
	
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
	
	private String _firstName;
	private String _middleName;
	private String _lastName;
	private String _birthDate; //dd/mm/yyyy
	private Grades _grade;
	private String _fullName;
	
	public Student(String firstName, String middleName, String lastName,
					  String birthDate, String inputGrade) {
		//Default constructor for a student
		this._firstName = firstName;
		this._middleName = middleName;
		this._lastName = lastName;
		this._birthDate = birthDate;
		this._grade = Grades.valueOf(inputGrade.toUpperCase());
		this._fullName = (firstName+" "+middleName+" "+lastName);
	}
	
	public String firstName() {
		//returns the first name
		return this._firstName;
	}
	public String middleName() {
		//returns the middle name
		return this._middleName;
	}
	public String lastName() {
		//returns the last name
		return this._lastName;
	}
	public String birthDate() {
		//returns the birth date
		return this._birthDate;
	}
	public Grades grade() {
		//returns the grade
		return this._grade;
	}
	public String fullName() {
		//returns the full name
		return this._fullName;
	}
}

public class StudentArray {
	
	public static void main(String[] args) throws IOException {
		//Fill an array with students
		
		int numberOfStudents = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		while(true) {
			//get the number of students in the classroom
			System.out.println("How many students are in the class?");
			String input = reader.readLine();
			try {
				//convert to int
				numberOfStudents = Integer.parseInt(input);
				if(numberOfStudents>0) {
					break;
				} else {
					 System.out.println("Please enter a positive number");
				}
			}  catch (NumberFormatException stringInput) {
				System.out.println("Please enter a number");
			}
		}
		
		Student[] classroom = new Student[numberOfStudents];
		
		for(int student=1; student<=classroom.length; student++) {
			//get fields required to create student
			System.out.println("What is student "+student+"'s first name?");
			String firstName = reader.readLine();
			System.out.println("What is "+firstName+"'s middle name?");
			String middleName = reader.readLine();
			System.out.println("What is "+firstName+"'s last name?");
			String lastName = reader.readLine();
			System.out.println("What is "+firstName+"'s birth date? (dd/mm/yyyy)");
			String birthDate = reader.readLine();
			System.out.println("What is "+firstName+"'s grade?");
			String grade = reader.readLine();
			
			classroom[student-1] = new Student(firstName, middleName, lastName,
											 birthDate, grade);
		}
		
		//print each student
		for(Student student: classroom) {
			System.out.println("Name: "+student.fullName()+" Birth Date: "
								+student.birthDate()+" Grade: "+student.grade());
		}
	}
}