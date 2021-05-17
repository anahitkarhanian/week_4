package day1;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minAgeOfStudent;

    University(){};
    University(String name,int countOfStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents ){
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.minAgeOfStudent = minAgeOfStudents;
    }

    void printInfo(){
        System.out.println("count of students is " + countOfStudents);
        System.out.println("maximum count of students is " + maxAgeOfStudent);
        System.out.println("maximum age of students is " + maxAgeOfStudent);
        System.out.println("minimum age of students is " + minAgeOfStudent);
    }

    boolean checkAge(int age){
        if(age >= minAgeOfStudent && age <= maxAgeOfStudent) {
            return true;
        } else {
            return false;
        }
    }

    void admission(){
        System.out.println("Our courses");
        System.out.println("Applied Mathematics -- 1");
        System.out.println("Computer science -- 2");
        System.out.println("History -- 3");
        System.out.println("Philosophy -- 4");
        System.out.println("Biology -- 5");
        System.out.println("Sociology -- 6");
    }

    boolean register(){
        countOfStudents++;
        if(countOfStudents <= maxCountOfStudents){
            return true;
        } else {
            return false;
        }
    }

    void chooseAProfession(){
        admission();

        System.out.println("Please choose number one of the courses");
        Scanner scanner = new Scanner(System.in);
        int numberOfCourses = scanner.nextInt();

        if (numberOfCourses == 1 || numberOfCourses == 2 || numberOfCourses == 3 ||
                numberOfCourses == 4 || numberOfCourses == 5 || numberOfCourses == 6){
            System.out.println("Please Input your age");
            int age = scanner.nextInt();
            if(checkAge(age)){
                if(register()){
                    System.out.println("you registered");
                } else {
                    System.out.println("Sorry, this is not the place!");
                }
            } else {
                System.out.println("There is no such age group");
            }
        } else {
            System.out.println("Sorry, there are no more courses");
        }
    }
}
