package com.Collection_Queu_Dequeu;

public class Car 
{
	
	private String name;
	
	//------
	
	public Car(String name) {this.name = name;}

	//------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//------

	public int compareTo(Car car) { return this.getName().compareTo(car.getName()); }
	
	@Override
	public int hashCode() 
	{
		return name.hashCode();
	}
	
	@Override
	public String toString()
	{
		return "Car(" +	"name = " + name + ')';
	}
	
}
