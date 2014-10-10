package com.farevee.groceries;

public class NonFood implements Item{
	  // +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
	
		String name;
		Weight weight;
		int price;
	
	  // +--------------+---------------------------------------------------
	  // | Constructors |
	  // +--------------+
		public NonFood(String _name, Weight _weight, int _price)
		{
			this.name = _name;
			this.weight = _weight;
			this.price = _price;
		}//BulkItem(double, String)
	
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		/**
		 * Returns, depending on the class, the string describing the class
		 */
		public String toString() {
			return (this.name);
		}//toString()

		/**
		 * Get the weight in whatever units an item uses.
		 */
		public Weight getWeight() {
			
			return this.weight;
		}//getWeight(int)
		
		/**
		 * Get the price of an time.
		 */
		public int getPrice() {
			return this.price;
		}//getPrice(int)
		
		
		/**
		 * Returns true or false.
		 */
		@Override
		public boolean equals(Object other) {
			if (!(other instanceof NonFood))
			{
				return false;
			}//if
			NonFood that = (NonFood) other;
			return (this.name.equals(that.name) && (this.weight == that.weight) && (this.price == that.price));
		}//equals()
}
