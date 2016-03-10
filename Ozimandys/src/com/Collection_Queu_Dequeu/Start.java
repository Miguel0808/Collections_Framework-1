package com.Collection_Queu_Dequeu;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Start {

	public static void main(String[] args) 
	{
		
		Queue<Car> cars = new ArrayBlockingQueue<Car>(6);
		
		Car car1 = new Car("Nissan");
		Car car2 = new Car("BMW");
		Car car3 = new Car("Toyota");
		Car car4 = new Car("KIA");
		Car car5 = new Car("NIVA");
		Car car6 = new Car("Lexus");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		
		System.out.println(cars.element());
		
		
		//======
		
		
		
		
	}
	
	

}
