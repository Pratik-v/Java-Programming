
public class q3_20bce1482 {
    // instance variables - replace the example below with your own

    public static void main(String[] args) {
        System.out.println("Implementing the features of TV remote and TV smart remote");

        TV obj = new TV();
        obj.switchOn();
        obj.switchOff();
        obj.switchNextChannel();
        obj.switchPrevChannel();
        obj.incrVol();
        obj.decVol();
        obj.switchOnMicroPhone();
        obj.switchOffMicroPhone();
        obj.switchWifiOn();
        obj.switchWifiOff();
    }

}

interface Tv_remote {
    void switchOn();

    void switchOff();

    void switchNextChannel();

    void switchPrevChannel();

    void incrVol();

    void decVol();
}

interface smart_Tv_remote {

    void switchOnMicroPhone();

    void switchOffMicroPhone();

    void switchWifiOn();

    void switchWifiOff();

}

class TV implements Tv_remote, smart_Tv_remote {

    public void switchOn() {
        System.out.println("Tv remote switched on");
    }

    public void switchOff() {

        System.out.println("Tv remote switched off");
    }

    public void switchNextChannel() {
        System.out.println("Switched to next channel");
    }

    public void switchPrevChannel() {
        System.out.println("Switched to previous channel");
    }

    public void incrVol() {
        System.out.println("Volume increased");
    }

    public void decVol() {
        System.out.println("Volume decreased");
    }

    public void switchOnMicroPhone() {
        System.out.println("Smart remote microPhone switched on");
    }

    public void switchOffMicroPhone() {
        System.out.println("Smart remote microPhone switched off");
    }

    public void switchWifiOn() {
        System.out.println("Wifi switched on by smart remote");
    }

    public void switchWifiOff() {
        System.out.println("Wifi switched off by smart remote");
    }

}
