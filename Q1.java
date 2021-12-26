//QUESTION:
/*•Let’s assume a VIT Bus with an unlimited capacity starts its morning pickup trip from a depot towards VIT University, with a driver and a bus attender .
The students shall board the bus from the first busstop (Egmore) till the last busstop (Vandalur).There are total 10 boarding points(busstops) from Egmore to Vandalur.
The Students boarding the bus at any pickup point is estimated as the 3/2 of the member’s already available in bus as in the previous board point. Calculate the total 
numbers of members (including the driver and the attender) in the bus when it reaches VIT and display all the stops with the available students . For eg(Egmore - 22) 
•Boarding points list for reference is given below(use this list in your program).
•‘EGMORE’,’ PANTHION_ROAD’,’ STERLING_ROAD’, ‘VALLUVARKOTTAM’,’ POTHYS’,’ MAMBALAM’,’ GUINDY’, ‘GST_ROAD’,’TAMBARAM’,’VANDALUR’
•For example: When the bus starts from depot there are two members in the bus, at Egmore stop 3/2 of the available members in the bus will board. 
At Panthion Road, more 3/2 of the available members in bus will board . It can be generated as [6/2,18/4,54/8,…].*/
//CODE:
import java.io.*;
import java.util.*;
public class Q1
{
public static void main(String args[])
{
String[] busstops={"Depot","EGMORE","PANTHION_ROAD","STERLING_ROAD","VALLUVARKOTTAM","POTHYS","MAMBALAM","GUINDY","GST_ROAD","TAMBARAM","VANDALUR"};
int depot=2,totalmembers=2;
int[] members=new int[11];
int[] num=new int[11];
int[] den=new int[11];
members[0]=depot;
den[0]=1;
num[0]=depot;
for(int i=1;i<11;i++)
{
members[i]=members[i-1]*3/2;
num[i]=num[i-1]*3;
den[i]=den[i-1]*2;
totalmembers+=members[i];
}
for(int i=0;i<11;i++)
{
System.out.println(busstops[i]+" - "+num[i]+"/"+den[i]);
}
System.out.println("Totalmembers="+totalmembers);
}
}
