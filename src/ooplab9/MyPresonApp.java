package ooplab9;

public class MyPresonApp {
    public static void main(String[] args) {
        Person person = new Person("001", "Kajonsak",
        new Address("70","Na","80110"),
        new Job("manager",20000));
        System.out.println(person.toString());
    }

}
