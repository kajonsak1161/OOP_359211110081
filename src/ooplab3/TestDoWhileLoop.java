package ooplab3;

import java.util.Scanner;

public class TestDoWhileLoop {
    public static void main(String[] args) {
//       do-while
        int n = 1;
        do {
            //statement
            System.out.print(n + " ");

        }//do
        while (++n <= 10);

//Correct Password
        int pin = 1234;
        int count = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your password: ");
            input = scanner.nextInt();
            count++;
            if (input ==pin){
                System.out.print("Your password is correct. ");
            }
            if (count == 3) {
                System.out.println("System Error.");
                break;
            }
        } while (input != pin);

        }//while
    }//main
//class
