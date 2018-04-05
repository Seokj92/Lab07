package edu.handong.csee.java.lab07.prob2;//package name


/**
 * This is a class to get name, price, and rating of chickens from user.
 * This class has string, double and int variable
 * This class has getter, setter method and constructor.
 * @author JS
 *
 */
class Choice {
	private String name; //declare a string variable
	private double price; //declare a double variable
	private int stars; //declare a int variable
	
	/**
	 * This is a constructor.
	 * @param type(name of chicken)
	 * @param how_much(price of chicken)
	 * @param rating(rate of chicken)
	 */
	public Choice(String type, double how_much, int rating)
	{
		name=type; // initialize the name to the value of type
		price=how_much; // initialize the price to the value of how_much
		stars=rating; // initialize the stars to the value of rating
	}
	
	/**
	 * This is a method to return the value of name.
	 * Variable name has been declared by private, we should approach it using a method.
	 * @return name(chicken)
	 */
	public String get_name()
	{
		return this.name; //return the name of Choice class
	}
	
	/**
	 * This is a method to return the value of price
	 * Variable price has been declared by private, we should approach it using a method.
	 * @return price(price of chicken)
	 */
	public double get_price()
	{
		return this.price; //return the price of Choice class
	}
	
	/**
	 * This is a method to return the value of stars.
	 * Variable stars has been declared by private, we should approach it using a method.
	 * @return stars(rating of chicken)
	 */
	public int get_stars()
	{
		return this.stars; //return the stars of Choice class
	}
	
	/**
	 * This is a method to set the value of name
	 * Variable name has been declared by private, we should approach it using a method.
	 * @param name(chicken)
	 */
	public void set_name(String name)
	{
		this.name=name; //change the value of name to a parameter.
	}
	
	/**
	 * This is a method to set the value of price
	 * Variable price has been declared by private, we should approach it using a method.
	 * @param price(price of chicken)
	 */
	
	public void set_price(double price)
	{
		this.price=price; //change the value of price to a parameter
	}
	
	/**
	 * This is a method to set the value of stars
	 * Variable price has been declare by private, we should approach it using a method.
	 * @param stars(rating of chicken)
	 */
	public void set_stars(int stars)
	{
		this.stars=stars; //change the value of price to a parameter.
	}
}

/**
 * This is a class to print out the result of this program
 * This class has a main method.
 * @author PC
 *
 */

public class Chicken {
	
	/**
	 * This is a main method to print out the name, price and rating of chicken.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Choice first = new Choice("Cheese_mustard", 16000.00, 5); //instantiate the Choice class and deliver parameters.
		Choice second = new Choice("Honey_mustard", 16000.00, 5); //instantiate the Choice class and deliver parameters.
		Choice third = new Choice("Spicey_chicken", 16000.00, 1); //instantiate the Choice class and deliver parameters.
		
		first.set_stars(3); // call set_stars method of the instance that first refers, and set the value.
		second.set_stars(4); // call set_stars method of the instance that first refers, and set the value.
		third.set_stars(1); // call set_stars method of the instance that first refers, and set the value.
		
		System.out.println(first.get_name() + "'s rating is " + first.get_stars()); //print out the name and rating.
		System.out.println(second.get_name() + "'s rating is " + second.get_stars()); //print out the name and rating.
		System.out.println(third.get_name() + "'s rating is " + third.get_stars()); //print out the name and rating
		
	}
}