package com.farevee.groceries;

public class ManyPackages extends Package{

	// +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
	
			Package type;
			int count;
			
	
	  // +--------------+---------------------------------------------------
	  // | Constructors | // credit to the Inheritance reading for reviewing constructors for subclasses
	  // +--------------+
		   public ManyPackages(Package type, int count) 
			   {
				super(name, weight, count);
				this.type = type;
				this.count = count;
				// TODO Auto-generated constructor stub
			   }//ManyPackages(double, double, String, String, String)
		
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		   /**
			 * Returns, depending on the class, the string describing the class
			 */
			@SuppressWarnings("static-access")
			public String toString(){
				return (this.count + " x " + this.weight + " of " + this.name);
			}//toString(int)
			
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
				return this.count * this.price;
			}//getPrice(int)	
		
			/**
			 * Returns true or false.
			 */
			@SuppressWarnings("static-access")
			public boolean equals(Object other) {  //compared object w/ memory location??
				// TODO Auto-generated method stub
				if (! (other instanceof ManyPackages))
				{
					return false;
				}
				ManyPackages that = (ManyPackages) other;
				
				
				return (this.name.equals(that.name) && (this.weight == that.weight) && (this.price == that.price)
						&& this.type.equals(that.type) && (this.count == that.count)); //I got help from Sam on this
			}//equals()
}
