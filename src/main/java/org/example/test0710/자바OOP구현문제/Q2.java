package org.example.test0710.자바OOP구현문제;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("유효하지 않은 나이입니다.");
        } else {
            this.age = age;
        }
    }

}

public class Q2 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("권지애");
        person.setAge(-1);
        person.setAge(10);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
