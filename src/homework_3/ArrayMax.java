package homework_3;

/*
1) объявить массив чисел из 10 элементов и написать код для поиска максимального значения
*/

public class ArrayMax {

    int [] arr = {2, 4, 9, 2, 1, 3, 2, 3, 2, 20};

    public static void main(String[] args) {

        ArrayMax Max = new ArrayMax();

        findMaxItem(Max.arr);
    }

    public static void findMaxItem(int [] array) {

        int maxItem = array[0];

        for (int i = 1; i < array.length; i++) {

            maxItem = (maxItem < array[i]) ? array[i] : maxItem;
        }
        System.out.println("Max item in the array is " + maxItem);
    }
}
