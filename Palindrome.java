/*The usual definition of a palindrome is a word that reads the same both forward
and backward, like "otto" and "palindromeemordnilap." An alternative way to
define a property like this is to specify a way of testing for the property. For
example, we might say, "a single letter is a palindrome, and a two-letter word
is a palindrome if the letters are the same, and any other word is a palindrome
if the first letter is the same as the last and the middle is a palindrome."
Create a java program to check the palindrome properties*/

import java.io.*;
import java.util.*;
public class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuffer s1=new StringBuffer(s);
    StringBuffer s2=new StringBuffer(s);
    s2.reverse();
    System.out.println(s1.toString().equal(s2.toString()));
  }
}
