public class Dalek1 {

    private double batteryCharge = 5.0;

    public void batteryReCharge (double c) {
        batteryCharge += c;
        System.out.println("Battery charge is: "+batteryCharge);
    }

    public void move(int distance) {
        for (int i = 1; i < distance+1; i++) {
            if (batteryCharge >= 0.5) {
                System.out.print("["+i+"] ");
            } else {
                System.out.print("Out of power!");
                break;
            }
            batteryCharge -= 0.5;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Dalek1 d = new Dalek1();
        d.move(11);
        d.batteryReCharge(2.5);
        d.batteryReCharge(0.5);
        d.move(5);
    }
}
