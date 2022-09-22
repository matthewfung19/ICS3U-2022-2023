package day5;

public class HomeworkFour {
    public static void main(String[] args) {
        double speed= 3*10.8;
        double seconds= 60;
        double minutes=60;
        double hours=24;
        double days=365;

        double distance= speed*seconds*minutes*hours*days;
        System.out.println("The beam would travel" + distance + "m in a year");
    }
}
