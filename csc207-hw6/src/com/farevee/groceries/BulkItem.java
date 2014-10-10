package com.farevee.groceries;
// credit to the Interfaces in Java reading, 


public class BulkItem implements Item{
	  // +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
		BulkFood food;
		Units unit;
		int amount;
		
	  // +--------------+---------------------------------------------------
	  // | Constructors |
	  // +--------------+
		public BulkItem(BulkFood food, Units unit, int amount)
		{
			this.food = food;
			this.unit = unit;
			this.amount = amount;
			
		}//BulkItem(BulkFood, Units, int)

		// +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		/**
		 * Returns, depending on the class, the string describing the class
		 */
		public String toString() {
			return (this.amount + " " + this.unit + "of " + this.food);
		}//toString()
		//I thought that objects already included toString in their implementation?


		/**
		 * Get the weight in whatever units an item uses.
		 */
		public Weight getWeight() {
			
			return new Weight(this.unit, this.amount); //credit to Evan Bruns for helping me figure out how to connect this 
		}//getWeight(int)
		
		/**
		 * Get the price of an time.
		 */
		public int getPrice() {
			return food.price(this.amount); //credit to Mira for explaining that I should use the object, not the class
		}//getPrice(int)
		
		
		/**
		 * Returns true or false.
		 */
		@Override
		public boolean equals(Object other)
		{
			if (! (other instanceof BulkItem))
			{
				return false;
			}
			BulkItem that = (BulkItem) other;
			
			return (this.food.equals(that.food) && (this.unit == that.unit) && (this.amount == that.amount));
		}

	}//superclass BulkItem

	
