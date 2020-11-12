package WeekOne.Object;

public class StringCodeTest {
  
  public static void main(String[] args) {
	
	System.out.println(makeAbba("Yo", "Alice"));
	System.out.println(firstHalf("HelloThere"));
	System.out.println(startHi("hi"));
  }
  
  /*
  Given two strings, a and b, return the result of putting them
  together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

	makeAbba("Hi", "Bye") → "HiByeByeHi"
	makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	makeAbba("What", "Up") → "WhatUpUpWhat"
   */
  public static String makeAbba(String a, String b) {
	return a + b + b + a;
  }

  /*
  Given a string of even length, return the first half.
  So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
   */
  
  public static String firstHalf(String str) {
	return str.substring(0, str.length() / 2);
  }
  
  /*
  Given a string, return true if the string starts
  with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
   */
  public static Boolean startHi(String str) {
	return str.startsWith("hi");
  }
  
  /*
  
Given a string and a non-negative int n,
return a larger string that is n copies of the original string.
	stringTimes("Hi", 2) → "HiHi"
	stringTimes("Hi", 3) → "HiHiHi"
	stringTimes("Hi", 1) → "Hi"
   */
  
  
  
}
