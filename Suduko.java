import java.io.*;
import java.util.*;
public class Suduko
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int[][] u={{1,2},{3,4}};
    int[][] i=new int[2][2];
    int[][] j=new int[2][2];
    int[][] k=new int[2][2];
    int[][] l=new int[2][2];
    for(int a=0;a<2;a++)
    {
      for(int b=0;b<2;b++)
      {
        i[a][b]=u[a][b];
        j[a][b]=u[1-a][b];
        k[a][b]=u[a][1-b];
        l[a][b]=u[1-a][1-b];
      }
    }
    for(int a=0;a<2;a++)
    {
      for(int b=0;b<2;b++)
      {
        System.out.print(i[a][b]+" ");
      }
      for(int b=0;b<2;b++)
      {
        System.out.print(j[a][b]+" ");
      }
      System.out.println();
    }
    for(int a=0;a<2;a++)
    {
      for(int b=0;b<2;b++)
      {
        System.out.print(k[a][b]+" ");
      }
      for(int b=0;b<2;b++)
      {
        System.out.print(l[a][b]+" ");
      }
      System.out.println();
    }
  }
}
