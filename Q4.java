//Multithreading
//Question:
/*Issue of tickets for an animation show is proposed to be automated with four parallel issue counters. The issue of tickets will start only 15 minutes prior to the show and 
is on-spot only. The system should ensure error-free delivery of tickets avoiding duplicate issue, missing ticket numbers etc., Develop an appropriate application in Java to 
automate the system. The admin should be able to view the complete process of delivering tickets*/
//Code:
class counter
{
int count;
int c0;
int c1;
int c2;
int c3;
public int sold()
{
count-=1;
return count;
}
}
public class Q4 {
public static void main(String args[]) throws Exception
{
counter c=new counter();
c.count=35; //total no of tickets
Thread t1=new Thread(new Runnable(){
public void run(){
while(c.count>0)
{System.out.println("S0 "+c.sold()+" Left");
c.c0++;}
}
});
Thread t2=new Thread(new Runnable(){
public void run(){
while(c.count>0)
{System.out.println("S1 "+c.sold()+" Left");
c.c1++;}
}
});
Thread t3=new Thread(new Runnable(){
public void run(){
while(c.count>0)
{System.out.println("S2 "+c.sold()+" Left");
c.c2++;}
  }
});
Thread t4=new Thread(new Runnable(){
public void run(){
while(c.count>0)
{System.out.println("S3 "+c.sold()+" Left");
c.c3++;}
}
});
t1.start();
t2.start();
t3.start();
t4.start();
t1.join();
t2.join();
t3.join();
t4.join();
System.out.println("Tickets sold by S0 : "+c.c0);
System.out.println("Tickets sold by S1 : "+c.c1);
System.out.println("Tickets sold by S2 : "+c.c2);
System.out.println("Tickets sold by S3 : "+c.c3);
System.out.println("ALL DONE!");
}
}
