package ooplab9;
//Has a relation เป็นส่วนหนึ่งของออปเจ็กซึ่งกันและกัน
public class MyCarApp {
    public static void main(String[] args) {
        Engine engine = new Engine("1500 CC", "V-VEC V4");
        Car car = new Car("Honda", "Black", "CITY", engine);
        System.out.println(car.toString());

        Car car1 = new Car("TOYOTA", "Red", "Altis", engine);
        System.out.println(car.toString());

    }//main
}//class
