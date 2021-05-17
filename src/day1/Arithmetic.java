package day1;

import java.util.Scanner;

public class Arithmetic {
    int[] array;
    Arithmetic(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        array = new int [length];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
    }

    Arithmetic(int[] array){
        this.array = new int [array.length];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = array[i];
        }
    }

    void insertionSort(){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j=i-1;
            while(j >= 0 && array[j] > key){
                int swap = array[j];
                array[j] = array[j+1];
                array[j+1] = swap;
                j--;
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < array.length-1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[indexOfMin])
                    indexOfMin = j;
            }
            int swap = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = swap;
        }
    }

    void bubbleSortOptimization() {
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                boolean check = false;
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;
                        check = true;
                    }
                }
                if (!check)
                    break;
            }
        }
        return;
    }

    int binarySearch(int number) {
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (array[middle] == number) {
                return middle;
            }
            if (array[middle] > number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return -1;
    }

    int min(){
        if(array.length != 0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] < min)
                    min = array[i];
            }
            return min;
        }
        return -1;
    }

    int max(){
        if(array.length != 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] > max)
                    max = array[i];
            }
            return max;
        }
        return -1;
    }

    double average(){
        if(array.length != 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / array.length;
        }
        return -1;
    }

    void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void checkArithmeticProgression(){
        System.out.println("Input 1 for getting min element");
        System.out.println("Input 2 for getting max element");
        System.out.println("Input 3 for getting average of array elements");
        System.out.println("Input 4 for binary search");
        System.out.println("Input 5 for bubble sort");
        System.out.println("Input 6 for insertion sort");
        System.out.println("Input 7 for selection sort");
        Scanner scanner = new Scanner(System.in);

        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                System.out.println("min element of array is " + min());
                break;
            case 2:
                System.out.println("max element of array is " + max());
                break;
            case 3:
                System.out.println("average of array elements is " + average());
                break;
            case 4:{
                selectionSort();
                System.out.println("Enter the number whose index you want to get");
                int number = scanner.nextInt();
                System.out.println(binarySearch(number));
            }
            break;
            case 5:{
                bubbleSortOptimization();
                print();
            }
            break;
            case 6:{
                insertionSort();
                print();
            }
            break;
            case 7:{
                selectionSort();
                print();
            }
            break;
            default:{
                System.out.println("you had to enter 1, 2, 3, 4, 5, 6 or 7");
            }
        }
    }
}
