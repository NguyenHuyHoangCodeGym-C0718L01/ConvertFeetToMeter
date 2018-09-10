import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Menu: ");
        System.out.println("1 - Convert Feet to Meter");
        System.out.println("2 - Convert Meter to Feet");
        System.out.println("0 - exit");

        int choice = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input the choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.print("Input the feet: ");
                    double feet = scanner.nextDouble();
                    System.out.println("Meter after converted: " + footToMeter(feet));
                    break;
                }
                case 2:{
                    System.out.print("Input the meter: ");
                    double meter = scanner.nextDouble();
                    System.out.println("Feet after converted: " + meterToFoot(meter));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }


        }while (choice != 0);
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

}
