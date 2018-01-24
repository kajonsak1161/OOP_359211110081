package ooplab7;
import java.util.Scanner;
public class SuperCarApp {
    //Exercise 11 lab7
    public static void main(String[] args) {
        SuperCar s0 = new SuperCar();
        s0 = inputData(s0);
        System.out.println(s0.toString());
    }//main

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plese enter a SuperCar info: ");
        System.out.print("Carband: ");
        s.setCarBrand(scanner.nextLine());
        System.out.print("CarColor: ");
        s.setCarColor(scanner.nextLine());
        System.out.print("CarEnginSize: ");
        s.setCarEngineSize(scanner.nextLine());
        System.out.print("MaxSpeed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("CountryOfOrigin: ");
        s.setCountryOfOrigin(scanner.nextLine());
        System.out.print("SuperCarClass: ");
        s.setSuperCarClass(scanner.nextLine());

        return s;
    }//input
}//class
