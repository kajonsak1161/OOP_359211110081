package MidTerm;
import java.util.Scanner;
public class CalIncome {
    public static void main(String[] args) {
        int getID;
        String getName;
        int getSalary = 0;
        int getOverTime = 0;
        int calculateTax = 0;

        Scanner oj = new Scanner(System.in);
        System.out.print("รหัสพนักงาน: ");
        getID = oj.nextInt();

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("ชื่อพนักงาน: ");
        getName = Keyboard.nextLine();

        System.out.print("เงินเดือน: ");
        getSalary = oj.nextInt();

        System.out.print("ค่าล่วงเวลา: ");
        getOverTime = oj.nextInt();

        if (getSalary+getOverTime >= 100000) {
            calculateTax = (getSalary + getOverTime);
            System.out.println("เสียภาษี: 10%");
            System.out.println("รายได้สุทธิ: " + calculateTax);
            System.out.println("ภาษีที่ต้องชำระ:" + calculateTax*10/100);

        } else if ((getSalary+getOverTime >= 70000)&&(getSalary+getSalary <= 99999)) {
            calculateTax = (getSalary + getOverTime);
            System.out.println("เสียภาษี: 7%");
            System.out.println("รายได้สุทธิ: " + calculateTax);
            System.out.println("ภาษีที่ต้องชำระ:" + calculateTax*7/100);

        } else if ((getSalary+getOverTime >= 50000)&&(getSalary+getSalary <= 69999)) {
            calculateTax = (getSalary + getOverTime);
            System.out.println("เสียภาษี: 5%");
            System.out.println("รายได้สุทธิ: " + calculateTax);
            System.out.println("ภาษีที่ต้องชำระ:" + calculateTax*5/100);

        }else if ((getSalary+getOverTime >= 30000)&&(getSalary+getOverTime <= 49999)) {
            calculateTax = (getSalary + getOverTime);
            System.out.println("เสียภาษี: 3%");
            System.out.println("รายได้สุทธิ: " + calculateTax);
            System.out.println("ภาษีที่ต้องชำระ:" + calculateTax*3/100);

        }
        else if (getSalary+getOverTime < 29999){
            calculateTax = (getSalary + getOverTime);
            System.out.println("เสียภาษี:1%");
            System.out.println("เงินเดือนสุทธิ: "+ calculateTax);
            System.out.println("ภาษีที่ต้องเสีย:" +calculateTax*1/100);
        }
    }//main
}//class
