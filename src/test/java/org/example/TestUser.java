package org.example;

import java.lang.annotation.Documented;

public class TestUser {
    public static void main(String[] args) {
        // Class level
        User u1 = User.builder().name("Tom").age(25).build();
        System.out.println(u1.getName()+" "+u1.getAge());

        User u2 = User.builder().name("Akila").build();
        System.out.println(u2.getName()+" "+u2.getAge());

        User u3 = User.builder().build();
        System.out.println(u3.getName()+" "+u3.getAge());

        //Constructor level
        Person p1 = Person.builder().name("Peter").age(30).build();
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getRole()+" "+p1.isActive);

        //Method level
        Customer c1 = Customer.builder().name("Lisa").age(40).build();
        System.out.println(c1.getName()+" "+c1.getAge()+" "+c1.getCity()+" "+c1.isActive);

    }
}
