package homework_3;

/*
2) написать метод, суммирующий все четные числа массива int [] array
*/

public class ArraySum {

    int [] arr = {2, 4, 9, 2, 1};

    public static void main(String[] args) {

        ArraySum Sum = new ArraySum();

        sumEvenItems(Sum.arr);
    }

    public static void sumEvenItems(int [] array) {

        int evenSum = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i]%2 == 0) {
                evenSum += array[i];
            }
        }
        System.out.println("Sum of even items is " + evenSum);
    }
}
