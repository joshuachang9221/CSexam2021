public class Main{
    public static void main(String[] args) {
        SmartHome home = new SmartHome();
        home.addSmartAppliances(new Light("L-1",0));
        home.addSmartAppliances(new AirConditioner("AC-1",2));
        home.enter(3);
        home.leave(2);
        home.leave(1);
    }
}