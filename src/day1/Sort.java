package day1;

public class Sort {

    void sort(Student array[], String name) {
        for (int i = 1; i < array.length; i++) {
            name = array[i].name;
            int j = i - 1;
            while (j >= 0 && array[j].name.compareTo(name) > 0) {
                Student swap = array[j];
                array[j] = array[j + 1];
                array[j + 1] = swap;
                j--;
            }
        }
    }

    void sort(Student array[], int age) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].age > array[j + 1].age) {
                    Student swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    check = true;
                }
            }
            if (!check)
                break;
        }
    }


    void sort(Student array[], double weight){
        for (int i = 0; i < array.length-1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j].weight < array[indexOfMin].weight)
                    indexOfMin = j;
            }
            Student swap = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = swap;
        }
    }

}
