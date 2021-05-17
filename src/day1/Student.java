package day1;

public class Student {
    String name;
    int age;
    double weight;
    Student(){};
    Student(String name,int age,double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.weight);
    }
}
