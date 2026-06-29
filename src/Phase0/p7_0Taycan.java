package Phase0;

public class p7_0Taycan {

    String brand = "Porsche";
    String model = "Taycan";
    int year = 2025;
    boolean isRunning = false;

    public void engineOn() {
        System.out.println("The engine says grrrwooooo");
        isRunning = true;
    }
    public void engineOff() {
        System.out.println("The system goes to sleep 'zzz");
        isRunning = false;
    }
    public void gas() {
        System.out.print("You hit the gas vroooommmm");
    }

    public void brake() {
        System.out.print("You hit the brake ooo");
    }
}
