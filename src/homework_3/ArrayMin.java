package homework_3;

/*
3) объявить массив из 5 чисел и найти минимальное значение элемента с нечетным индексом
*/

public class ArrayMin {

    int [] arr = {2, 2, 9, 2, 1, 3, 6, 1, 7};

    public static void main(String[] args) {

        ArrayMin Min = new ArrayMin();

        findMinOddItem(Min.arr);
    }

    public static void findMinOddItem(int [] array) {

        int minOddItem = array[0];
        for (int i = 1; i < array.length; i++) {

            if(i%2 != 0) {
                minOddItem = (minOddItem > array[i]) ? array[i] : minOddItem;
            }
        }
        System.out.println("Min item with odd index is " + minOddItem);
    }
}
