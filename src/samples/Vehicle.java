package samples;

public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    public Vehicle() {
        this.setColor("Red");
    }

    public Vehicle(String c) {
        this.setColor(c);
    }

    public static void horn() {

        System.out.println("Beep!");
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Green");
//    v1.setColor("Red");
        System.out.println(v1.getColor());
        System.out.println(v2.getColor());
        //v2.horn();
        Vehicle v = new Vehicle("Blue");
        System.out.println(v.getColor());
        Vehicle.horn();
    }
}
