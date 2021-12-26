//Question:
/*2. Ford factory has four types of employees namely manager,engineer,auditor and supervisors.The company have the following parameters to compute the salary of each employee.
a. Manager: Basic(Rs30000),DA(100% of basic),HRA(50% from basic),Car allowance(Rs 2500 pm),Travelling allowance(15% of basic)
b. Engineers:Basic(Rs 20000),DA(100% of basic),HRA( 30%of basic),Travelling allowance(5% of basic)
c. Auditors:Basic(rs 35000),DA(100% of basic),HRA(30 %of basic),LTA(10% of basic,mobile allowance(rs3000),carallowance(rs 2500)
d. Supervisors:basic(Rs 10000),DA(100%),HRA (25% of basic)
All the employees are inherited from the employee class which contains the member variables basic,DA,HRA and a method salary().
Create four different class namely manager,engineer,auditor and supervisors, which inherits from employee class and override the method salary in each class.*/
//Code:
import java.io.*;
import java.util.*;
abstract class Employee
{
int DA,HRA,BASIC;
abstract void salary();
}
class Manager extends Employee
{
int BASIC=30000,HRA=15000,DA=30000;
void salary()
{
System.out.print("Employee type: Manager \nSalary :");
System.out.println(BASIC+DA+HRA+2500+4500);
}
}
class Engineers extends Employee
{
int BASIC=20000,HRA=6000,DA=20000;
void salary()
{
System.out.print("Employee type: Engineers \nSalary :");
System.out.println(BASIC+DA+HRA+1000);
}
}
class Auditors extends Employee
{
int BASIC=35000,HRA=10500,DA=35000;
void salary()
{
System.out.print("Employee type: Auditors \nSalary :");
System.out.println(BASIC+DA+HRA+2500+3000+3500);
}
}
class Supervisors extends Employee
{
int BASIC=10000,HRA=2500,DA=10000;
void salary()
{
System.out.print("Employee type: Supervisors \nSalary :");
System.out.println(BASIC+DA+HRA);
}
}
public class Q3
{
public static void main(String args[])
{
Employee o1= new Manager();
Employee o2= new Engineers();
Employee o3= new Auditors();
Employee o4= new Supervisors();
o1.salary();
o2.salary();
o3.salary();
o4.salary();
}
}
