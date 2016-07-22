package com.week1.day5.assignment1;

public class TestMethodsAndFlow 
{
	public static void main(String[] args)
	{
		MethodsAndFlow testFlow = new MethodsAndFlow(args);
	
		testFlow.outputAll();
		
		testFlow.outputSubset(1, 6);
		testFlow.outputSubset(0, 14);
		testFlow.outputSubset(6, 2);
		testFlow.outputSubset(5, 4);
		testFlow.outputSubset(-2, 5);
		testFlow.outputSubset(15, 4);
	}
}