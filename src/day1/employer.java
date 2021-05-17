package day1;

public class employer {
    String name;
    int age;
    String workSpace;
    double salary;

    employer(){};

    employer(String name,int age,String workSpace, double salary){
        this.name = name;
        this.age = age;
        this.workSpace = workSpace;
        this.salary = salary;
    }

    void print(){
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("workSpace " + workSpace);
        System.out.println("salary " + salary);
    }
}
