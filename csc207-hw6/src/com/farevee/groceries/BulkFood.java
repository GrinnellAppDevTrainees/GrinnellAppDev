package com.farevee.groceries;

public class BulkFood {
	 // +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
	   /**
	    * The name of the group of food.
	    */
		String name;
		
	    /**
		 * The name of the unit.
		 */
		Units unit;
		
		 /**
		  * The name of the unit.
		  */
		int pricePerUnit;
		
		/**
		 *  The amount of supplies
		 */
		int supply;
	
	  // +--------------+---------------------------------------------------
	  // | Constructors |
	  // +--------------+
		public BulkFood(String name, Units unit, int pricePerUnit, int supply)
		{
			this.name = name;
			this.unit = unit;
			this.pricePerUnit = pricePerUnit;
			this.supply = supply;
		}
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		/**
		 * Returns, depending on the class, the string describing the class
		 */
		public String toString() {
			return (this.supply + " " + this.unit + "of " + this.name);
		}//toString()
		
		public int price(int amount) {
			return this.pricePerUnit * amount;
		}
}
