package edu.handong.csee.java.lab07.prob3;//package name
import java.util.Random;//importing a package, java.util.Random

/**
 * This is a class to get the name, student id, grade and the number of days of absence.
 * This class has string, int variables
 * This class has getter ,setter method and constructor
 * @author JS
 *
 */

class Student {
	private String name, student_num; //declare string variables
	private int grade, absence; //declare int variables
	
	/**
	 * This is a constructor 
	 * @param stu(Student name)
	 * @param yr(Student grade) 
	 * @param id(Student ID)
	 * @param miss(Number of days of absence)
	 */
	public Student(String stu, int yr, String id, int miss)
	{
		name=stu; //initialize the name to the value of stu
		student_num=id; //initialize the student_num to the value of id
		grade=yr; //initialize the grade to the value of yr
		absence=miss; //initialize the absence to the value of miss
	}
	
	/**
	 * This is a method to return the value of name.
	 * Variable name has been declared by private, we should approach it using a method.
	 * @return name(student name)
	 */
	
	public String get_name()
	{
		return name; //return student name
	}
	
	/**
	 * This is a method to return the value of student ID
	 * Variable student_num has been declared by private, we should approach it using a method.
	 * @return student_num(student ID)
	 */
	public String get_id()
	{
		return student_num; //return student id
	}
	
	/**
	 * This is a method to return the value of grade
	 * Variable grade has been declared by private, we should approach it using a method.
	 * @return grade(student grade)
	 */
	public int get_grade()
	{
		return grade; //return student grade
	}
	
	/**
	 * This is a method to return the value of the day of absence
	 * Variable absence has been declared by private, we should approach it using a method.
	 * @return absence(day of absence)
	 */
	public int get_absence()
	{
		return absence; //return the number of day of absence
	}
	
	/**
	 * This is a method to set the value of name
	 * Variable name has been declared by private, we should approach it using a method.
	 * @param name(student name)	 
	 */

	public void set_name(String name)
	{
		this.name = name; //change the value of name to a parameter.
	}
	
	/**
	 * This is a method to set the value of student id
	 * Variable student_num has been declared by private, we should approach it using a method.
	 * @param student_num(student id)
	 */
	public void set_id(String student_num)
	{
		this.student_num = student_num; //change the value of student_num to a parameter.
	}
	
	/**
	 * This is a method to set the value of grade
	 * Variable grade has been declared by private, we should approach it using a method.
	 * @param grade(student grade)
	 */
	public void set_grade(int grade)
	{
		this.grade = grade; //change the value of grade to a parameter.
	}
	
	/**
	 * This is a method to set the value of the number of days of absence
	 * Variable absence has been declared by private, we should approach it using a method.
	 * @param absence(the number of days of absence)
	 */
	public void set_absence(int absence)
	{
		this.absence = absence; //chage the value of absence to a parameter.
	}
}

/**
 * This is a class to print out the result of this program.
 * This class has a main method.
 * @author JS
 *
 */


public class Attendence {
	
	/**
	 * This is a main method to print out name, grade, id and missed day of student.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Student stu1 = new Student("Jess", 4 ,"21400999", 0); //instantiate the student class and deliver parameters.
		Student stu2 = new Student("Kent", 2 ,"21700111", 0); //instantiate the student class and deliver parameters.
		Student stu3 = new Student("Lucas", 1 , "21833222", 0); //instantiate the student class and deliver parameters.
		Student stu4 = new Student("Martha", 2 , "21733444", 0); //instantiate the student class and deliver parameters.

		Random absent_num = new Random(); //instantiate random class.
		
		stu1.set_absence(absent_num.nextInt(10)); //Set the number of days of absence to any number between 1 and 10.
		stu2.set_absence(absent_num.nextInt(10)); //Set the number of days of absence to any number between 1 and 10.
		stu3.set_absence(absent_num.nextInt(10)); //Set the number of days of absence to any number between 1 and 10.
		stu4.set_absence(absent_num.nextInt(10)); //Set the number of days of absence to any number between 1 and 10.
		
		if(stu1.get_absence() > 6) //if the number of days of absence is more than 6, students fail this course
		{
			System.out.println("I'm sorry. " + stu1.get_name() + " You fail this course"); //print out the string.
			System.out.println(stu1.get_name() + " - Number of absence : " + stu1.get_absence()); //the number of days of absence.
		}
		else
		{
			System.out.println("We'll see about the grade, " + stu1.get_name()); //else students pass this course
		    System.out.println(stu1.get_name() + ", You get " + stu1.get_grade() + "th grade"); //grade that student get
		}
		
		if(stu2.get_absence() > 6) //if the number of days of absence is more than 6, students fail this course
		{
			System.out.println("I'm sorry. " + stu2.get_name() + " You fail this course"); //print out the string
			System.out.println(stu2.get_name() + " - Number of absence : " + stu2.get_absence()); //the number of days of absence.
		}
		else
		{
			System.out.println("We'll see about the grade, " + stu2.get_name()); //else students pass this course
		    System.out.println(stu2.get_name() + ", You get " + stu2.get_grade() + "nd grade"); //grade that student get
		}
		
		if(stu3.get_absence() > 6) //if the number of days of absence is more than 6, students fail this course
		{
			System.out.println("I'm sorry. " + stu3.get_name() + " You fail this course"); //print out the string.
			System.out.println(stu3.get_name() + " - Number of absence : " + stu3.get_absence()); //the number of days of absence.
		}
		else
		{
			System.out.println("We'll see about the grade, " + stu3.get_name()); //else student pass this course
		    System.out.println(stu3.get_name() + ", You get " + stu3.get_grade() + "st grade"); //grade that student get
		}
		
		if(stu4.get_absence() > 6) //if the number of days of absence is more than 6, students fail this course
		{
			System.out.println("I'm sorry. " + stu4.get_name() + " You fail this course"); //print out the string
			System.out.println(stu4.get_name() + " - Number of absence : " + stu4.get_absence()); //the number of days of absence
		}
		else
		{
			System.out.println("We'll see about the grade, " + stu4.get_name()); //else student pass this course
			System.out.println(stu1.get_name() + ", You get " + stu4.get_grade() + "nd grade"); //grade that student get
		}
	}
}