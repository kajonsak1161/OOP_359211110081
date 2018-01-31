package ooplab8;

import java.text.SimpleDateFormat;

public class Person {
    private class  Person {
        private String name;
        private String gender;
        private SimpleDateFormat dateOfbirth;
        private String age;
        //contsructor เจนโค้ด Ale+insert+constructor
        public Person(String name, String gender, SimpleDateFormat dateOfbirth, String age) {
            this.name = name;
            this.gender = gender;
            this.dateOfbirth = dateOfbirth;
            this.age = age;
        }

        //tosting เจนโค้ด Alt+insert+tosting
        @Override   // การพ้องรูป Override ลักษณะเฉพาะ
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", dateOfbirth=" + dateOfbirth +
                    ", age='" + age + '\'' +
                    '}';
        }

        //getter setter methods เจนโค้ด เก็ตเตอร์ เซ็ตเตอร์

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public SimpleDateFormat getDateOfbirth() {
            return dateOfbirth;
        }

        public void setDateOfbirth(SimpleDateFormat dateOfbirth) {
            this.dateOfbirth = dateOfbirth;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }//class
}//class
