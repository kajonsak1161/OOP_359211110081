package ooplab5;

import java.util.Scanner;

//1. user input data to array
//2. show data in array
//3. summation data in array
//4. average value in array
public class InputDataToArray {
    private static final int MAX = 5;   //kong tee
    private static int number[] = new int[MAX];

    public static void main(String[] args) {

        inputData(number, number.length);
        showData(number, number.length);
        sumData(number, number.length);

    }//main

    private static void sumData(int[] number, int length) {
        int total = 0;
        for (int i=0;i<length;i++) {
            total += number[i];
        }//for
        System.out.println(total+"\n");
        System.out.println("The average data in array: "+(total/length));
    }

    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for (int i = 0; i < length; i++){
            System.out.print(number[i] + " ");
    }

        System.out.println();
}
    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.print("enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//inputdata
}//class
