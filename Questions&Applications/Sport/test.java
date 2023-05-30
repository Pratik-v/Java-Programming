package Sport;

public class test {
    public static void main(String args[]) {
        Cricket c1=new Cricket("Players",4,1);
        Cricket c2=new Cricket("Players1",3,2);
        Cricket c3=new Cricket("Players2",2,3);
        Cricket c4=new Cricket("Players3",1,4);
        Cricket c5=new Cricket("Players4",0,5);
    }
}

class Cricket {
    String teamname;
    int noofwins;
    int nooflosses;
    Cricket(String teamname,int nooflosses,int noofwins){
        this.teamname=teamname;
        this.noofwins=noofwins;
        this.nooflosses=nooflosses;
    }
    Cricket(String teamname){
        this.teamname=teamname;
        this.noofwins=0;
        this.nooflosses=0;
    }
    String name() {
        return teamname;
    }
    int wins() {
        return noofwins;
    }
    int losses() {
        return nooflosses;
    }
}