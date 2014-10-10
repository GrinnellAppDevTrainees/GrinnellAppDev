package com.farevee.groceries;

public class Package implements Item{
	   // +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
			static String name;
			static Weight weight;
			int price;
	
	  // +--------------+---------------------------------------------------
	  // | Constructors |
	  // +--------------+
		@SuppressWarnings("static-access")
		public Package(String name, Weight weight, int price)
		{
			this.name = name;
			this.weight = weight;
			this.price = price;
		}//BulkItem(String, Weight, int)
		
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		/**
		 * Returns, depending on the class, the string describing the class
		 */
		@SuppressWarnings("static-access")
		public String toString() {
			return (this.weight + " of " + this.name);
		}//toString()
		
		/**
		 * Get the weight in whatever units an item uses.
		 */
		@SuppressWarnings("static-access")
		public Weight getWeight() {
			return this.weight;
		}//getWeight(int)
		
		/**
		 * Get the price of an time.
		 */
		public int getPrice() {
			return this.price;
		}//getPrice(int)
		
		
		@SuppressWarnings("static-access")
		public boolean equals(Object other) {
			if (!(other instanceof Package))
			{
				return false;
			}//if
			ManyPackages that = (ManyPackages) other;
			
			return (this.name.equals(that.name) && (this.weight == that.weight)
					&& (this.price == that.price));
			
		}//equals(Object) 
		//credit to Sam for helping me clear up this section
}
