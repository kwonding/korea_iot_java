package org.example.test0710.자바OOP구현문제;

class Animal {
    void name() {
        System.out.println("이름");
    }

    void makeSound() {
        System.out.println("울음소리");
    }
}

class Dog extends Animal {
    @Override
    void name() {
        System.out.println("초코");
    }

    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void name() {
        System.out.println("나비");
    }

    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal pet : animals) {
            pet.name();
            pet.makeSound();
        }

    }
}
