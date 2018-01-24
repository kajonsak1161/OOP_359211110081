package ooplab7;
import java.util.Scanner;
public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        //default constructor
        Student s1 = new Student();
        s1.setId("001");
        s1.setName("Boy SaiYai");
        s1.setAddress("109 M.2 T.Thamyai A.ThungSong");
        s1.setGender("Male");
System.out.println(s1.getName());
System.out.println(s1.getGender());
//toString คือ แสดงค่าทั้งหมด
        System.out.println(s1.toString());
        Student s2 = new Student("002", "girl Saiyai", "11/11 T.Tawang A.Mung", "Female");
        System.out.println(s2.toString());
//แก้ไขใช้set
        s2.setName("girl Shongkla");
        System.out.println(s2.toString());
        //user assign data to object
        Student s3 = new Student();
        s3 = inputData(s3);
        System.out.println(s3.toString());
    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plese enter a student info: ");
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        System.out.print("Gender: ");
        s.setGender(scanner.nextLine());
        return s;
    }//input
}//class
