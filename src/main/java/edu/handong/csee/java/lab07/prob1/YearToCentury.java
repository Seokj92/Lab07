package edu.handong.csee.java.lab07.prob1; //package name
import java.util.Scanner;//importing a package, java.util.Scanner

/**
 * This is a class to calculate the century of the years.
 * The calculate class has a int variable.
 * the calculate class has a cal_year method and a constructor.
 * @author JS
 *
 */
class calculate { 
	int year; //declare a int variable
	
	/**
	 * This is a constructor
	 * @param num(years)
	 */
	
	public calculate (int num) {
		year=num; // initialize the year to the value of num
	}
	
	/**
	 * 
	 * This is a method to get the century from the year
	 * @author : JS
	 * @return : year(century)
	 */
	
	public int cal_year()
	{
		if(year%100==0)
			year = year/100; //when divided by 100
		else
			year=(year/100)+1; //when the years don't divided by 100, we should add +1 to get century of the years.
			
			return year; //return the century
	}
}

/**
 * This is a class to print out the century
 * This class has main method
 * @author JS
 *
 */
public class YearToCentury {

	/**
	 * The main method of this program to print out result of the calculation. 
	 * This method has int variable.
	 * @param args unused
	 */
	public static void main(String[] args) {
		int present; // declare a int variable
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard.
		
		System.out.println("Input year : "); //print out the string
		present = sc.nextInt(); //get the years from keyboard
		
		calculate year = new calculate(present); //instantiate calculate class 
		System.out.println(present + " is " + year.cal_year() + "th century."); //print out the century of the years.
	}
		

}
