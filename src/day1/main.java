package day1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*employer employer1 = new employer("Anahit", 21, "IKM",-5000);
        employer employer2 = new employer();
        employer1.print();
        employer2.print();*/

        /*Shop shop1 = new Shop("Silver", "Amiryan 12",
                123, 12000, 0);
        shop1.questionAnswer();*/

       /* University university = new University("YSU",5000,
                5030, 32, 17);
        university.chooseAProfession();*/

        /*Arithmetic arithmetic = new Arithmetic();
        arithmetic.checkArithmeticProgression();*/

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        Student array[] = new Student [length];
        for (int i = 0; i < array.length; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            double weight = scanner.nextDouble();
            array[i] = new Student(name,age,weight);
        }
        Sort sOrt = new Sort();
        sOrt.sort(array,12);
        for (int i = 0; i < array.length; i++) {
            array[i].print();
        }

    }
}
