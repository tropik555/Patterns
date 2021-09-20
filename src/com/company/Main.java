package com.company;

import com.company.Builders.innerStaticClass.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person parent = new Person.Builder()
                .withName("Ivan")
                .withSurname("Iv")
                .withAge(40)
                .withHeight(180)
                .withWeight(80)
                .build();

        System.out.println(parent.toString());

        Set<Person> parents = new HashSet<>();
        parents.add(parent);


        Person son = new Person.Builder()
                .withName("Bob")
                .withSurname("Iv")
                .withAge(15)
                .withHeight(180)
                .withWeight(80)
                .withParents(parents)
                .build();

        System.out.println(son.toString());

//first
    }
}
