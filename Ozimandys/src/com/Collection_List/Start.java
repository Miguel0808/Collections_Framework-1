package com.Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Start 
{

	public static void main(String[] args) 
	{
		
//		arrayListExample();
		linkedListExample();
		
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void arrayListExample()
	{
		ArrayList<Car> cars = new ArrayList();
		
		Car cars1 = new Car("BMW");
		Car cars2 = new Car("NIVA");
		Car cars3 = new Car("Nissan");
		Car cars4 = new Car("Nissan");
		
		cars.add(cars1);
		cars.add(cars2);
		cars.add(cars3);
		cars.add(cars4);
		
		cars.add(new Car("Toyota"));
		
		System.out.println("cars.size = " + cars.size());
		System.out.println("cars.contains(car2) = " + cars.contains(cars2));	// чи містить колекція певний об'єкт
		
		int index = cars.indexOf(cars3);
		System.out.println("index = " + index);   // отримання індекса елемента
		
		Car selectedCar = cars.get(3);	// отримання об'єкта по індексу
		System.out.println("selectedCar = " + selectedCar);
		
		
		
		// ordered
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getName());
		}
		
		
		cars.clear();	// очистка колекції
		System.out.println("cars.isEmpty = " + cars.isEmpty());	 // чи є пустою колекція
		
//		selectedCar = cars.get(3);   // IndexOutofBoundException
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void linkedListExample()
	{
		LinkedList<Car>cars = new LinkedList();
		
		Car cars1 = new Car("Bmw");
		Car cars2 = new Car("NIVA");
		Car cars3 = new Car("Nissan");
		Car cars4 = new Car("Toyota");
		
		cars.add(cars1);
		cars.add(cars2);
		cars.add(cars3);
		cars.add(cars4);
		
		cars.addLast(cars1);
		
		Iterator<Car> iterator = cars.descendingIterator();	 // ітератор у зворотню сторону
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getName());
		}
		
	}

}
