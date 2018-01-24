package ooplab7;
//Talking about Student?
//1.Student ID
//2.Name
//3.Address
//4.Gender

public class Student {
    //properties of Student คืออันเดียวกับแอททริบิวต์
    private String id;
    private String name;
    private String address;
    private String gender;
//Constructor
//Default Constructor แบบค่าดีเฟาว์ Overloading มี 2 ตัว
    public  Student(){}
//Constructor by own แบบสร้างขึ้นมาเอง
    public Student(String id,String n,String a, String g){
        //assign data to properties ประกาศค่าเท่ากับตัวแปร
        this.id = id;
        this.name = n;
        this.address = a;
        this.gender = g;
    }//Student
    // override medthod คือ เอาคลาสมาใช้นอกเม็ดทอส Ale+insert=string
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    //getter and setter methods ต้องมี 2 เม็ดทอสควบคู่ กด Ale+insert=getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
