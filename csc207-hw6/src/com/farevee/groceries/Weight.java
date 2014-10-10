package com.farevee.groceries;

public class Weight {
	 // +--------+---------------------------------------------------------
	  // | Fields |
	  // +--------+
		Units unit;
		int amount;
	
	  // +--------------+---------------------------------------------------
	  // | Constructors |
	  // +--------------+
		public Weight (Units _unit, int _amount)
		{
			this.unit = _unit;
			this.amount = _amount;
		}//Weight(Units, int)
	  // +---------+--------------------------------------------------------
	  // | Methods |
	  // +---------+
		public String toString () { 
			//credit to China for suggesting implementing a method
			return (this.amount + " "+ this.unit);
		}//toString()
}//class Weight 
