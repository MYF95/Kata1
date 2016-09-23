package kata1v1;

import java.util.Date;

public class Kata1v1 {

    public static void main(String[] args) {
        Person person = new Person("Mack ", "Yao", new Date(95,6,27));
        System.out.println(person.getName() + person.getSurname() + " tiene " + person.getAge() + " años");
    }
}
