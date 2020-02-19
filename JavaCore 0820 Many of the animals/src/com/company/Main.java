package com.company;

/*
0819 Set of cats
1. Inside the class Solution, create a public static class cat - Cat.
2. Implement the createCats method, it must create a set of cats and add 3 cats to it.
3. In the main method, remove one cat from Set cats.
4. Implement the printCats method, it should display all the cats that are left in the set.
Each cat from a new line.

Requirements:
1. The program should display the text on the screen.
2. Inside the Solution class, there must be a public static class Cat.
3. The createCats () method of the Solution class should return a set (Set) containing 3 cats.
4. The printCats () method of the Solution class should display all the cats in the set. Each cat from a new line.
5. The main () method should call the createCats () method.
6. The main () method should call the printCats () method.
7. The main () method should remove one cat from many cats.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args)  {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()   {
        HashSet<Cat> cats = new HashSet<Cat>();

        cats.add(new Cat()); cats.add(new Cat());
        cats.add(new Cat()); cats.add(new Cat());

        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet();
        dogs.add(new Dog()); dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    public static Set <Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object>iterator = pets.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}


