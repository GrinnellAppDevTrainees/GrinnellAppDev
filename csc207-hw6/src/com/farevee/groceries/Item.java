package com.farevee.groceries;

public interface Item {
	/**
	 * Get the weight in whatever units an item uses.
	 */
	public Weight getWeight();
	
	/**
	 * Get the price of an time.
	 */
	public int getPrice();
	
	/**
	 * Returns, depending on the class, the string describing the class
	 */
	public String toString();
	//I thought that objects already included toString in their implementation?
	
	/**
	 * Returns true or false.
	 */
	public boolean equals(Object other);
}

