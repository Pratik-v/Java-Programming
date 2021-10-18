import java.io.*;
import java.util.*;
public class Ceaser_Cypher
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    StringBuffer s=new StringBuffer(sc.nextLine());
    int n;
    n=sc.nextInt();
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=' ')
      s.setCharAt(i,(char)(((int)s.charAt(i)+n-97)%26+97));
    }
    for(int i=0;i<s.length();i++)
    {
      System.out.print(s.charAt(i));
    }
  }
}
