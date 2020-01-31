package main;

import java.util.ArrayList;
import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String answer="";
		
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<3;j++) {
				answer= answer+ input.charAt(i);
			}
		}
		return answer;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String toolower= input.toLowerCase();
		int firstindex= input.indexOf("bert");
		int lastindex= input.lastIndexOf("bert");
		
		//if()
		String[] arr =input.split("bert");
		for (String element : arr) {
			System.out.println(element);
		}
		
		//int firstindex= input.indexOf("bert");
		//int lastindex= input.lastIndexOf("bert");
	
		//System.out.println(firstindex);
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		numbers.sort(null);
		int checkab=numbers.get(1)-numbers.get(0);
		int checkbc=numbers.get(2)-numbers.get(1);
		if(checkab == checkbc) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int num= (int) a/2;
		int middle = (int)input.length()/2;
		int backno= middle-num;
		int forwardno=middle+num;
		String result= input.substring(0, backno)+input.substring(forwardno+1, input.length());
		
		
		return result;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		String name= input;
		String tolower = name.toLowerCase();
		if(tolower.endsWith("dev")) {
			return true;
			
		}
		else {
			return false;
		}
		
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		List<Integer>numbervalue=new ArrayList<Integer>();
		int num=0;
		for(int i=0; i<input.length();i++) {
			num=input.lastIndexOf(i)-input.indexOf(i);
			numbervalue.add(num);
			
		}
		numbervalue.sort(null);
		int resultingnumber= numbervalue.get(numbervalue.size()-1);
		return resultingnumber;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int counter =0;
		String tolowercase =arg1.toLowerCase();
		String[] arr= tolowercase.split(" ");
		for (String element: arr) {
			if(element.equals("am")) {
				counter=counter+1;
			}
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String name="";
		if(arg1%3 ==0) {
			if(arg1%5==0) {
				name= "fizzbuzz";
			}else {
				name= "fizz";
			}	
		}else if(arg1%5 ==0) {
			if(arg1%3 ==0) {
				name= "fizzbuzz";
			}else {
				name= "buzz";
			}
			
		}
		return name;
		
		
	}
	//int name=Math.
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		int a=0;
		List<Integer>numbervalues=new ArrayList<Integer>();
		String[] numbers= arg1.split(" ");
		for (String number: numbers) {
			
			for(int k=0; k<number.length();k++) {
				a= a+Character.getNumericValue(number.charAt(k));
				
			}
			
			numbervalues.add(a);
			a=0;
		}

		numbervalues.sort(null);
		int result= numbervalues.get(numbervalues.size()-1);
		
		return result;
		
	}
	
	
}
