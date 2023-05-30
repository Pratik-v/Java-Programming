/*Write a java IO and collection program to 
• Identify the numbers of births in particular region from the given input file name "births-deaths-by-region". 
• identify the number of death during the period 2020. • Identify the total number of regions 
• Identify the year which has more birth counts Save the object of your class as "lab9.dat" and perform deserialization*/ 
import java.io.*; 
import java.util.*; 
public class Q5 { 
  public static void main(String[] argv) throws Exception { 
    List<Report> reports=readfromcsv("G:/PriyanshuVyas/CSE1007_JAVA-LAB/9/births-deaths-by-region.csv"); 
    List pregion=new ArrayList(); 
    List period=new ArrayList(); 
    List birthcounts=new ArrayList(); 
    int noofdeathsduring2020=0; 
    for(Report a : reports) { 
      if(!pregion.contains(a.getRegion())) { 
        pregion.add(a.getRegion()); 
      } 
      if(!period.contains(a.getPeriod())) { 
        period.add(a.getPeriod()); 
      } 
      if(a.getPeriod()==2020 && a.getBirth_Death().equals("Deaths")) { 
        noofdeathsduring2020+=a.getCount(); 
      } 
    } 
    System.out.println("\n\n"+"1.The numbers of births in particular region : \n"); 
    for (int i=0;i<pregion.size();i++) {
      int sum=0; 
      for(Report a: reports) { 
        if(pregion.get(i).equals(a.getRegion()) && a.getBirth_Death().equals("Births")) { 
          sum+=a.getCount(); 
        } 
      } 
      System.out.print(pregion.get(i)+" : "); 
      System.out.println(sum); 
    } 
    for (int i=0;i<period.size();i++) { 
      int sum2=0; for(Report a: reports) { 
        if(period.get(i).equals(a.getPeriod()) && a.getBirth_Death().equals("Births")) { 
          sum2+=a.getCount(); 
        } 
      } 
      birthcounts.add(sum2); 
    } 
    System.out.println("\n"+"2.The number of death during the period 2020 : "+noofdeathsduring2020); 
    System.out.println("\n"+"3.The total number of regions are : "+pregion.size()); 
    System.out.print("\n"+"4.The year which has more birth counts is : "+ period.get(birthcounts.indexOf((int)Collections.max(birthcounts)))); 
  } 
  private static List<Report> readfromcsv(String filename) throws Exception { 
    List<Report> reports=new ArrayList<>(); FileReader fr=new FileReader(filename); 
    BufferedReader br=new BufferedReader(fr); String line = br.readLine(); line=br.readLine(); 
    while(line!=null) { 
      String[] attributes=line.split(","); Report report=createReport(attributes); 
      reports.add(report); line=br.readLine();
      } 
    return reports; 
  } 
  private static Report createReport(String[] data) { 
    int Period=Integer.parseInt(data[0]); 
    String Birth_Death=data[1]; 
    String Region=data[2]; 
    int Count=Integer.parseInt(data[3]); 
    return new Report(Period,Birth_Death,Region,Count); 
  } 
} 
class Report { 
  private String Birth_Death,Region; 
  private int Period,Count; 
  public Report(int Period,String Birth_Death,String Region,int Count) { 
    this.Period = Period; this.Birth_Death = Birth_Death; 
    this.Region = Region; this.Count = Count; 
  } 
  public int getPeriod() { 
    return Period; 
  } 
  public void setPeriod(int Period) { 
    this.Period= Period; 
  } 
  public String getBirth_Death() { 
    return Birth_Death; 
  } 
  public void setBirth_Death(String Birth_Death) { 
    this.Birth_Death = Birth_Death; 
  } 
  public String getRegion() { 
    return Region; 
  }
  public void setRegion(String Region) { 
    this.Region = Region; 
  } 
  public int getCount() { 
    return Count; 
  } 
  public void setCount(int Count) { 
    this.Count= Count; 
  } 
  // @Override public String toString() 
  // { 
  // return "Report [Period=" + Period + ", Birth_Death=" + Birth_Death + ", Region=" + Region + ", Count=" + Count + "]"; 
  // } 
}
