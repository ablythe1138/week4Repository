package codingProject;

import java.lang.reflect.Array;

public class CodingProjectWk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int difference = ages[ages.length-1] - ages[0]; //.length-1 indicates the final element in the set and 0 is the first
		System.out.println(difference);
		
		int[] ages2 = {5, 7, 9, 11, 13, 15, 17, 19, 21}; 
		int difference2 = ages2[ages2.length-1] - ages2[0]; //.length-1 indicates the final element in the set and 0 is the first
		System.out.println(difference2);
		
		int total = 0; // finding sum
		
		for (int age : ages2) {
			total += age; // total = 117
		}
		double averageAge = total / ages2.length; //total divided by number of elements in 2nd array 
		System.out.println(averageAge);
		
		System.out.println("~~~~~~~~~~~");
		
		// 2) 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int nameLength = 0; 
		
		for (String name : names) { // for every element "name" run through names string 
			nameLength += name.length(); // sum = 21
		} 
		double averageNameLength = nameLength / names.length; 
		System.out.println(averageNameLength);
		
		String concatenate = "";		// could possibly have used string builder, but the string wasn't very long 
		for (String name : names) {
			concatenate += name + " ";
		}
		System.out.println(concatenate);
		
		System.out.println("~~~~~~~~~~~");
		
		// 3) last element
		String lastElement = names[names.length -1];
		// 4) first element
		String firstElement = names[0];
		
		// 5)
		// make a new int arr for lengths
		int[] nameLengths = new int[names.length];
		
		// counter to be used as index
		int counter = 0;
	
		//	loop each name in the name arr then add length at index counter	
		for (String nm : names) {
			nameLengths[counter] = nm.length();
			
			// I was worried that the lengths were not on the arr. I used this for testing.
			System.out.println(nm.length());
			
			// increment counter
			counter++;
		
		}
		
		// 6) 
		
		// sum
		int nameLengthSum = 0;
		
		// loop names then total
		for (int nameSize : nameLengths) {
			nameLengthSum += nameSize; 
		} 
		System.out.println(nameLengthSum);
		
		System.out.println("~~~~~~~~~~~");
		// 7)
		System.out.println(wordRepeater("Bonjour", 6));
		
		// 8)
		System.out.println(showFullName("Mickey", "Mouse"));
		
		// 9)
		int[] test = {50,30};
		System.out.println(isGreaterThanOneHundo(test));
		
		// 10) 
		double[] testScores = {3, 4, 5, 5,};
		System.out.println(getAverage(testScores));
		
		// 11)
		double[] testScores2 = {3, 5, 5, 5,};
		System.out.println(evalAverages( testScores2, testScores));
		
		// 12)
		System.out.println(willBuyDrink(true, 10.51));
		
		// 13)
		System.out.println(isNumberEven(5));
			
	}
	// 7 continued  method takes word and count then concat  
	static String wordRepeater (String word, int count) {
		String newPhrase = "";
		
		for (int i = 0; i < count; i++) {
			newPhrase += word;
		}
		return newPhrase;
	}
	
	// 8 continued
	static String showFullName (String first, String last) {
		// create a new variable with both first and last names
		String fullName = first + " " + last;
		
		// return full name
		return fullName;
	}
	
	// 9 continued
	static boolean isGreaterThanOneHundo(int[] numbers) {
		// create sum
		int oneHundoSum = 0;
		
		// loop each number, if sum is greater then exit function as true
		for(int num: numbers) {
			oneHundoSum+= num;
			if (oneHundoSum > 100) {
				return true;
			}
		}
		
		// exit false
		return false;
	}
	
	// 10 continued
	static double getAverage(double[] scores) {
		// create raw total to be be divided by the the total length
		double raw = 0.0;
		
		for (double s: scores) {
			raw += s;
		}
		
		
		return raw/scores.length;
	}
	
	// 11 continued
	static boolean evalAverages(double[] firstAvg, double[] secondAvg) {
		// use previous method to get averages
		double first = getAverage(firstAvg);
		double second = getAverage(secondAvg);
		
		// if average of first is greater then return true
		if (first > second ) {
			return true;
		}
		
		return false; 
	}
	
	// 12 continued
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		// this will only be true when both meet the criteria
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}

		return false;
	}
	
	// 13 determine if number is prime
	static boolean isNumberEven(int number) {
		
		// % operator is cool
		if (number % 2 == 0) {
			// if the number can be divided by 2 it is even 
			return true;
		}
		
		return false;
	}

}
