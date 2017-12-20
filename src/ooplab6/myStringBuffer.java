package ooplab6;

public class myStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        System.out.println(buffer);
        buffer.append(20);
        System.out.println(buffer);
        buffer.insert(5," ");
        System.out.println(buffer);
//        System.out.println(buffer.reverse()); กลับคำ
        buffer.append(" RMUTSV");
        System.out.println(buffer);
        buffer.delete(6, 8);
        System.out.println(buffer);
        printBuff(buffer);

       //method สร้างเพิ่มเติม
        printBuff(buffer);
    }//main

    private static void printBuff(StringBuffer buffer) {
        System.out.println(buffer);
    }//pb
}//class
