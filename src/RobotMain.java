
//封裝
public class RobotMain {
    public static void main(String[] args) {
        Robot r=new Robot("GUMDAM",2022);
        System.out.println(r.getName());
        r.setName("Aerial");
        System.out.println(r.getName());

        System.out.println(r.getMadeYear());
        r.setMadeYear(2034);
        System.out.println(r.getMadeYear());
    }
}
