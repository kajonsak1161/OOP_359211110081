package ooplab9;

public class MyPresonApp {
    public static void main(String[] args) {
        Person person = new Person("001", "Kajonsak",
        new Address("70","NakonSriThammarat","80110"),
        new Job("manager",20000));
        System.out.println(person.toString());

        person.getJob().setSalary(30000);
        System.out.println("Name:"+person.getName()+"  Sarary:"+person.getJob().getSalary());
    }

}
