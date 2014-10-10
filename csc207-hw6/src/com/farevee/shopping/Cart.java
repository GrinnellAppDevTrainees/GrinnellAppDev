package com.farevee.shopping;

import java.io.PrintWriter;
import java.lang.Object;
import java.util.LinkedList;

import org.w3c.dom.Node;

import com.farevee.groceries.Item;

public class Cart {
		  // +--------+---------------------------------------------------------
		  // | Fields |
		  // +--------+
				Item item;
				private Node head;
				private int listCount;
		
		  // +--------------+---------------------------------------------------
		  // | Constructors | 
		  // +--------------+
				public Cart() {
					head = new Node(null);
					listCount = 0;
				}
				public N
			
		  // +---------+--------------------------------------------------------
		  // | Methods |
		  // +---------+

			   /**
				 * Add an item to the cart.
				 */
				public String[] addItem() {
					Node temp = new Node(item);
					Node current = head;
					
					while (current.getNext() != null) {
						current = current.getNext();
					}
					current.setNext(temp);
					listCount++;
				}//toString(int)
				
				 /**
				 * Get the number of things in the cart.
				 */
				public int numThings() {
				ManyPackages.quantity
				//check if it is a package or many packages
					return shoppingCart.length;
				}//numThings()
				//you may want to add an accessor for the Many Packages count?!
				
				 /**
				 * Get the number of entries in the cart
				 */
				public int numEntries() { //are we assuming that manyPackages have been inserted as one entry?
					return shoppingCart.length;
				}//numEntries()
				
				/**
				 * Prints the contents of the cart.
				 */
				public String printContents(PrintWriter pen)
				{
					pen.println(shoppingCart);
				}//printContents(PrintWriter)
				
				/**
				 * Computes the total price of the order, in cents.
				 */
				public int getPrice()
				{
					int totalPrice;
					for (int i = 0; i < shoppingCart.length; i++)
					{
						totalPrice += shoppingCart[i].getPrice;
					}
				}//getPrice()
				
				/**
				 * Returns an array of weights, but combines similar weights.
				 */
				public double getWeight()
				{
					
				}//getWeight()
				
				/**
				 * Removes all of the products whose name exactly matches name
				 */
				public String[] remove(String name)
				{
				
				}//remove(String)
				
				/**
				 * Finds identical items and merges them into a single item
				 */
				public String[] merge()
				{
					
				}//merge()
}
