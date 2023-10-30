
// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)


import java.util.HashMap;
public class RomanToInteger {
public static void main(String[] args) {
 String romanNumeral = "IX"; // Replace with your Roman numeral
 int result = romanToInt(romanNumeral);
 System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + result);
 }
 public static int romanToInt(String s) {
 
 HashMap<Character, Integer> romanMap = new HashMap<>();
 romanMap.put('I', 1);
 romanMap.put('V', 5);
 romanMap.put('X', 10);
 romanMap.put('L', 50);
 romanMap.put('C', 100);
 romanMap.put('D', 500);
 romanMap.put('M', 1000);
 int result = 0;
 int prevValue = 0; 
 for (int i = s.length() - 1; i >= 0; i--) {
 int currValue = romanMap.get(s.charAt(i));
 
 if (currValue < prevValue) {
 result -= currValue; // Handle subtraction case (e.g., IV = 4, IX = 9)
 } else {
 result += currValue;
 }
 
 prevValue = currValue;
 }
 return result;
 }
}
// 3. Check if the input is pangram or not. (A pangram is a sentence that contains all the
// alphabets from A to Z)
