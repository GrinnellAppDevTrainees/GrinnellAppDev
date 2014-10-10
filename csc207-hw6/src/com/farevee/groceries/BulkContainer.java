package com.farevee.groceries;

public class BulkContainer extends BulkItem {


	// +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
		BulkFood food;
		Units unit;
		int amount;
		String container;
	
	  // +--------------+---------------------------------------------------
	  // | Constructors | // credit to the Inheritance reading for reviewing constructors for subclasses
	  // +--------------+
		   public BulkContainer(BulkFood food, Units unit, int amount,
					String container) 
			   {
				super(food, unit, amount);
				// TODO Auto-generated constructor stub
				this.container = container;
			   }//BulkContainer(BulkFood, Units, int, String)
		
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		/**
		 * Returns, depending on the class, the string describing the class
		 */
		public String toString() {
			return (this.container + "of " + this.amount + " " + this.unit + "of " + this.food);
		}//toString()
		//I thought that objects already included toString in their implementation?

		/**
		 * Get the weight in whatever units an item uses.
		 */
		public Weight getWeight() {
			return new Weight(this.unit, this.amount);
		}//getWeight(int)
		
		/**
		 * Get the price of an time.
		 */
		public int getPrice() {
			return food.price(this.amount);
		}//getPrice(int)
		
		/**
		 * Returns true or false.
		 */
		@Override
		public boolean equals(Object other) {
			// TODO Auto-generated method stub
			if (! (other instanceof ManyPackages))
			{
				return false;
			}
			BulkContainer that = (BulkContainer) other;
			
			return (this.food.equals(that.food) && (this.unit == that.unit) && (this.amount == that.amount)
					&& this.container.equals(that.container)); //I got help from Sam on this
		}//equals()

}//subclass BulkContainer
