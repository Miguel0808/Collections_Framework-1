package com.Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	
	public static void main(String[] args) 
	{
//		hashSetExample();
//		treeSetExample();
		linkedHashSet();
		
		// For Set must be implemented hashCode!!!
	}

	
	// not ordered and not sorted !!
	// םאירגטהרטי
	// םאיןנמסע³ירטי

public static void hashSetExample()
{
	Set <Car> cars = new HashSet<Car>();
	
	Car car1 = new Car("how");
	Car car2 = new Car("how");
	Car car3 = new Car("you?");
	Car car4 = new Car("youre");
	
	cars.add(car1);
	cars.add(car2);
	cars.add(car3);
	cars.add(car4);
		
	Iterator <Car> iterator = cars.iterator();
	
	while(iterator.hasNext())
	{
		Car car = iterator.next();
		System.out.println(car.getName());
	}
}

//------


	// sorted!!
	// םאיןמג³כüם³רטי
public static void treeSetExample()
{
	Set <Integer> tree = new TreeSet <Integer>();
	
	tree.add(34);
	tree.add(21);
	tree.add(67);
	tree.add(23);
	tree.add(676);
	tree.add(453);
	tree.add(23);
		
	Iterator <Integer> iterator = tree.iterator();
	
	while(iterator.hasNext())
	{
		System.out.print(iterator.next() + " ");
	}
	
	
	
}

//------

		// ordered but not sorted!!
		// נמחרטנ‏÷ HashSet
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void linkedHashSet()
{
	LinkedHashSet set = new LinkedHashSet();
	
	set.add(34);
	set.add(334);
	set.add(123);
	set.add(546);
	set.add(162);
	set.add(565);
	
	Iterator iterator = set.iterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	
	
}

//======

}
