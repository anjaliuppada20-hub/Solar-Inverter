import java.util.Scanner;

public class SolarInverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SOLAR INVERTER =====");

        System.out.print("Enter Solar Voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter Solar Current (A): ");
        double current = sc.nextDouble();

        System.out.print("Enter Inverter Efficiency (%): ");
        double efficiency = sc.nextDouble();

        // Calculate solar power
        double solarPower = voltage * current;

        // Calculate AC output
        double acPower = solarPower * efficiency / 100;

        // Calculate power loss
        double loss = solarPower - acPower;

        System.out.println("\n===== RESULT =====");

        System.out.println("Solar Power  : " + solarPower + " W");
        System.out.println("AC Power     : " + acPower + " W");
        System.out.println("Power Loss   : " + loss + " W");

        if (acPower > 0) {
            System.out.println("Inverter Status: ON");
        } else {
            System.out.println("Inverter Status: OFF");
        }

        sc.close();
    }
}

