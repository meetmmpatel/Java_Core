package WeekOne.Object;



public class CodeTestPartTwo {
  
  /*
  1 Given a string, return a version without both the first and last char of the string.
  The string may be any
  length, including 0.
	withouEnd2(“Hello”) → “ell”
	withouEnd2(“abc”) → “b”
	withouEnd2(“ab”) → “”
*/
  
  /*

2 Given a string and an int n, return a string made of the first and last n chars from
the string. The string length
will be at least n.
nTwice(“Hello”, 2) → “Helo”
nTwice(“Chocolate”, 3) → “Choate”
nTwice(“Chocolate”, 1) → “Ce”
*/
  /*
3.Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
twoChar(“java”, 0) → “ja”
twoChar(“java”, 2) → “va”
twoChar(“java”, 3) → “ja”
*/
  /*
4.Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with “edited”.
frontAgain(“edited”) → true
frontAgain(“edit”) → false
frontAgain(“ed”) → true
*/
  /*
5.Given a string, return a version without the first 2 chars. Except keep the first char if it is ‘a’ and keep the second char if it is ‘b’. The string may be any length. Harder than it looks.
deFront(“Hello”) → “llo”
deFront(“java”) → “va”
deFront(“away”) → “aay”
*/
  /*
6.Given a string, if the first or last chars are ‘x’, return the string without those ‘x’ chars, and otherwise return the string unchanged.
withoutX(“xHix”) → “Hi”
withoutX(“xHi”) → “Hi”
withoutX(“Hxix”) → “Hxi”
*/
  /*
7.Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/
  /*
8.Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/
  /*
9.Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/
  /*

10.Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/
  /*


11.Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
*/
  /*
12.We’ll say that a 1 immediately followed by a 3 in an array is an “unlucky” 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
*/
  /*

13.Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
   */
}
