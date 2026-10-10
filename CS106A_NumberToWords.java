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
 * after days of getting nowhere. But now uses 
 * Eric Roberts' suggested switch method instead 
 * of SergiuPlesco's enum approach.
 * 
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
			if (clientInput < 0) { println("goodbye"); break; }
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
		if (n == 0){ return "zero"; }
		println("new hello");
		
		//handle negatives use 'minus' w parseInt
		
		String stringifiedN = "";
		
		if (n / BILLION > 0){
			stringifiedN += numberToWords(n / BILLION) + " billion ";
			n %= BILLION;
		}
		
		if (n / MILLION > 0){
			stringifiedN += numberToWords(n / MILLION) + " million ";
			n %= MILLION;
		}
		
		if (n / THOUSAND > 0){
			stringifiedN += numberToWords(n / THOUSAND) + " thousand ";
			n %= THOUSAND;
		}
		
		if (n / HUNDRED > 0){
			stringifiedN += numberToWords(n / HUNDRED) + " hundred ";
			n %= HUNDRED;
		}
		
		
		if (n > 0 && n < 10){
			//handle ones
			switch (n){
			case 1:
				stringifiedN += "one";
				break;
			case 2:
				stringifiedN += "two";
				break;
			case 3:
				stringifiedN += "three";
				break;
			case 4:
				stringifiedN += "four";
				break;
			case 5:
				stringifiedN += "five";
				break;
			case 6:
				stringifiedN += "six";
				break;
			case 7:
				stringifiedN += "seven";
				break;
			case 8:
				stringifiedN += "eight";
				break;
			case 9:
				stringifiedN += "nine";
				break;
			default:
				stringifiedN += "";
			}
		} 
		else if (n > 10 && n < 20) {
			//handle teens
			switch (n % 10){
			case 1: 
				stringifiedN += "eleven";
				break;
			case 2:
				stringifiedN += "twelve";
				break;
			case 3:
				stringifiedN += "thirteen";
				break;
			case 4:
				stringifiedN += "fourteen";
				break;
			case 5:
				stringifiedN += "fifteen";
				break;
			case 6:
				stringifiedN += "sixteen";
				break;
			case 7:
				stringifiedN += "seventeen";
				break;
			case 8:
				stringifiedN += "eighteen";
				break;
			case 9:
				stringifiedN += "nineteen";
				break;
			default:
				stringifiedN += "";
			}
			
		}
		else { 
			//handle tens
			switch (n / 10){
			case 1:
				stringifiedN += "ten";
				break;
			case 2: 
				stringifiedN += "twenty";
				break;
			case 3:
				stringifiedN += "thirty";
				break;
			case 4:
				stringifiedN += "forty";
				break;
			case 5:
				stringifiedN += "fifty";
				break;
			case 6:
				stringifiedN += "sixty";
				break;
			case 7:
				stringifiedN += "seventy";
				break;
			case 8:
				stringifiedN += "eighty";
				break;
			case 9:
				stringifiedN += "ninety";
				break;
			default:
				stringifiedN += "";
			}
			stringifiedN += "-" + numberToWords(n % 10);
		}
		
		return stringifiedN;
	}
	
	/**
	 * the below is unused but good for future reference.
	 * */
	private enum tensNames {
		zero,//accounts for .values() being zero-indexed
		ten,
		twenty,
		thirty,
		forty,
		fifty,
		sixty,
		seventy,
		eighty,
		ninety,
	};
	
	private enum numNames {
		zero,
		one,
		two,
		three,
		four,
		five,
		six,
		seven,
		eight,
		nine,
		ten,
		eleven,
		twelve, 
		thirteen,
		fourteen,
		fifteen,
		sixteen,
		seventeen,
		eighteen,
		nineteen
	};
	
	/** instance variables */
}