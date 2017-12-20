package ooplab6;

import java.io.BufferedReader;
import java.util.StringTokenizer;
//นับจำนวนคำ บทที่ 6 แบบฝึกหัด
public class myStringToken {
    public static void main(String[] args) {
        String s = "Welcome to RMUSTV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        System.out.println(tokenizer.countTokens());
        //count word in string
        System.out.println(tokenizer.countTokens());
        //cut word in String ตัดคำ
        //reverse word in String
        while (tokenizer.hasMoreTokens()){
            //BufferedReader ตัดคำและกลับคำ
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }








    }//main
}//class
