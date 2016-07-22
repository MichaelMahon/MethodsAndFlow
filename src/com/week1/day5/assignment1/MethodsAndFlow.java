package com.week1.day5.assignment1;

public class MethodsAndFlow
{
	private String[] stringArray;
	private Integer startPosition;
	private Integer numberOfValuesToOutput;

	public String[] getStringArray()
	{
		return stringArray;
	}

	public void setStringArray(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	public Integer getStartPosition()
	{
		return startPosition;
	}

	public void setStartPosition(Integer startPosition)
	{
		this.startPosition = startPosition;
	}

	public Integer getNumberOfValuesToOutput()
	{
		return numberOfValuesToOutput;
	}

	public void setNumberOfValuesToOutput(Integer numberOfValuesToOutput)
	{
		this.numberOfValuesToOutput = numberOfValuesToOutput;
	}

	private MethodsAndFlow()
	{

	}

	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	// output the requested elements in the string array
	public void outputSubset(int startPosition, int numberOfValuesToOutput)
	{
		setStartPosition(startPosition);
		setNumberOfValuesToOutput(numberOfValuesToOutput);

		this.printValues(); // print the given parameters

		// if the inputs are valid print the requested array elements
		if (noErrorsFound())
		{
			for (int i = startPosition; i < (numberOfValuesToOutput + startPosition < stringArray.length - 1 ? numberOfValuesToOutput + startPosition : stringArray.length); i++)
			{
				System.out.println(stringArray[i]);
			}

			System.out.println();
		}
	}

	// output all elements in the string array
	public void outputAll()
	{
		outputSubset(0, this.stringArray.length);
	}

	// check to make sure the provided parameters are within the bounds of the
	// array and are positive numbers
	public Boolean noErrorsFound()
	{
		String err = "";

		if (startPosition < 0)
		{
			err += "Error: You entered a negative start position, please enter a positive start position.\n";
		}
		if (startPosition > stringArray.length - 1)
		{
			err += "Error: You entered a start position that is larger than the length of the array, please enter a smaller number.\n";
		}

		if (err != "")
		{
			printErrors(err);
		}

		return err == "" ? true : false;
	}

	// print the errors
	public void printErrors(String err)
	{
		System.out.println(err);
	}

	// print the start date and number of variables
	public void printValues()
	{
		System.out.println("Starting position: " + startPosition + " Number of values: " + numberOfValuesToOutput);
	}
}