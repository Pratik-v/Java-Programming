//Question:
/*1. Ford factory has four types of employees namely manager,engineer,auditor and supervisors.The company have the following parameters to compute the salary of each employee.
a) Manager: Basic(Rs30000),DA(100% of basic),HRA(50% from basic),Car allowance(Rs 2500 pm),Travelling allowance(15% of basic)
b) Engineers:Basic(Rs 20000),DA(100% of basic),HRA( 30%of basic),Travelling allowance(5% of basic)
c) Auditors:Basic(rs 35000),DA(100% of basic),HRA(30 %of basic),LTA(10% of basic,mobile allowance(rs3000),carallowance(rs 2500)
d) Supervisors:basic(Rs 10000),DA(100%),HRA (25% of basic)
Create a class called ford, create a method salary() and overload the salary method such that it can compute the salary for the employees and print employee type and their salary*/
//Code:
import java.io.*;
import java.util.*;
class ford
{
void salary(int p1,int p2,int p3,int p4,int p5){
System.out.print("Employee type: Manager \nSalary :");
System.out.println(p1+(p2*p1*0.01)+(p3*p1*0.01)+p4+(p5*p1*0.01));
}
void salary(int p1,int p2,int p3,int p4){
System.out.print("Employee type: Engineers \nSalary :");
System.out.println(p1+(p2*p1*0.01)+(p3*p1*0.01)+(p4*p1*0.01));
}
void salary(int p1,int p2,int p3,int p4,int p5,int p6){
System.out.print("Employee type: Auditors \nSalary :");
System.out.println(p1+(p2*p1*0.01)+(p3*p1*0.01)+(p4*p1*0.01)+p5+p6);
}
void salary(int p1,int p2,int p3){
System.out.print("Employee type: Supervisors \nSalary :");
System.out.println(p1+(p2*p1*0.01)+(p3*p1*0.01));
}
}
public class Q2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ford o1=new ford();
o1.salary(30000,100,50,2500,15);
o1.salary(20000,100,30,5);
o1.salary(35000,100,30,10,3000,2500);
o1.salary(10000,100,25);
}
}
