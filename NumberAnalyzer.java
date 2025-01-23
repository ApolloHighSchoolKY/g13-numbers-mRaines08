//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyzer
{
	//Instance Variable/Collection
	private ArrayList<Number> list;

	//Default Constructor
	public NumberAnalyzer()
	{
		//Just make the ArrayList exist.
		list = new ArrayList<Number>();
	}

	//Modified Constructor
	public NumberAnalyzer(String numbers)
	{
		//Make the list exist first
		list = new ArrayList<Number>();

		//Filter the parameter through to the set method
		
	}

	//Methods
	public void setList(String numbers)
	{
		//Clear the list


		//Create a scanner to chop up the string of numbers


		//Chop up the string


	}

	public int countOdds()
	{
      	int oddCount=0;


      	return oddCount;
	}

	public int countEvens()
	{
      	int evenCount=0;


      	return evenCount;

      	/*
      	 *Other option - If it's not odd, it's even
      	 *
      	 *return list.size()-countOdds();
      	 *
      	 */
	}

	public int countPerfects()
	{
      	int perfectCount=0;


      	return perfectCount;
	}

	public String toString( )
	{
		return "" + list;
	}
}