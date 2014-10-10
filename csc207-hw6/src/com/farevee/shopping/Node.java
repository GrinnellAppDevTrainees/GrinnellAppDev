package com.farevee.shopping;

// this started getting a little complicated for me. I needed a refresher on
// implementing linked lists from scratch since Java doesn't have these defined(?)
//    these are the resources I used for refresher: 
// http://www.cs.grinnell.edu/~walker/courses/161.sp14/modules/pointers-stacks-queues/reading-queues.shtml
// I saw a website that provided an excellent refresher, and helped define the 
// most basic of methods, which will be helpful later on whenever we get back 
// to this.  I ran out of time, so I ended up stopping here 
//     - http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

public class Node {
    // reference to the next node in the chain,
    // or null if there isn't one.
    Node next;
    // data carried by this node.
    // could be of any type you need.
    Object data;

    // Node constructor
    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}
