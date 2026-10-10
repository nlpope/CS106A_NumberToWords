/**
 * File: CS106A_NumberToWords.java
 * ---------------------------------
 * The CS106A_NumberToWords class takes a numeric 
 * input from the client and converts an integer  
 * into words. 
 * 
 * 
 * Attributions:
 * Adapted from SergiuPlesco's github solution
 * after days of getting nowhere.
 */

import acm.program.*;
import java.util.*;

public class CS106A_NumberToWords extends ConsoleProgram
{
	/** named constants */
	private static final int BILLION = 1000000000;
	private static final int MILLION = 1000000;
	private static final int THOUSAND = 1000;
	private static final int HUNDRED = 100;
	
	public void run()
	{
		introduceApp();
		while(true){
			int clientInput = readInt("Enter a number: ");
			if (clientInput < 0) { break; }
			println(numberToWords(clientInput));
		}
	}
	
	
	private void introduceApp()
	{
		println("This program converts numbers to words. Enter a " +
				"negative number to exit the program." +
				"Enter a positive number between 0 and 999,999 to keep going.");
	}
	
	/**
	 * Converts numbers into words.
	 * @param n the number to be converted
	 * @return the stringified number
	 * */
	private String numberToWords(int n)
	{
		String stringifiedNum = "";
		
		//isolateDigits in clumps of three after you add commas 
		//using a comma ticker which will also dictate the suffix
		Integer moldableInteger = (Integer) n;
		String nWithCommas = addCommas(moldableInteger.toString());
		
		//if triclump[0] == 0, skip to teens switch
		//if triclump[1] == 0, skip to ones switch
		//if triclump[2] == 0, skip to next outer suffix
		String[] endSuffixArr = {"","thousand","million","billion","trillion"};
		for (int i = 0; i < nWithCommas.length(); i++){
			int j = 0;
			String currentSuffix = endSuffixArr[2] ;
			println();
			if (nWithCommas.charAt(i) == ','){
				//reset triclump to 0
				currentSuffix = endSuffixArr[i];
			}
			//advance triclump to next base-10 placement
		}
		
		
		switch()
		
		
		//^ replaces below
		while (n > 0){
			int lastDigit = n % 10;
			isolatedDigitsArr.add(0, n % 10);
			n /= 10;
		}
		//stringifyDigit()
		int commasPresent = 0;
		for (int i = 0; i < isolatedDigitsArr.size(); i++){
			//add the commas
			commasPresent++;
		}
		//handle postfixed cases based on x / 10 (?)
		//use addcommas from last proj to add both commas and 
		//assign suffix based on how many commas present 
		
		return stringifiedNum;
	}
	
	
	private String addCommas(String strDigits)
	{ 
		StringBuffer sb = new StringBuffer(strDigits);
		
		if (strDigits.length() > 3){
			//int commasPresent = 0;
			int tripleDigitTracer = 1;
			for (int i = strDigits.length()-1; i > 0; i--){
				if (tripleDigitTracer == 3){
					sb.insert(i,',');
					tripleDigitTracer = 0;
				}
				tripleDigitTracer++;
			}
		}
		return sb.toString();
	}
	
	/** instance variables */
}