package ooplab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("chayen", "2");
        System.out.println(dog.toString());
        dog.makeNoise();
    }
}//class