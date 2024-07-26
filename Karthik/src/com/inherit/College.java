package com.inherit;

public class College {

    void add()
{
	System.out.println("rec");
}
}
class Dept extends College
{
	void print() {
		System.out.println("cse");
	}
}
class Year extends Dept{
    void disply()
		{
			System.out.println("third");
		}
	}
