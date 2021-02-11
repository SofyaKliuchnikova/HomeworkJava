import com.sun.source.util.SourcePositions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args){

        int[] array1 = {0, 1, 1, 0, 1 ,0, 0, 1, 0, 1, 0};
        System.out.println("Задание 1.");
        System.out.println("Исходный массив:\t " + Arrays.toString(array1));
        oneIsNull(array1);
        System.out.println("Измененный массив: \t" + Arrays.toString(array1));
        System.out.println();


        int[] array2 = new int[8];
        filling(array2);
        System.out.println("Задание 2. " + Arrays.toString(array2));
        System.out.println();


        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3.");
        System.out.println("Исходный массив: \t" + Arrays.toString(array3));
        double6(array3);
        System.out.println("Измененный массив: \t" + Arrays.toString(array3));
        System.out.println();

        int[] array4 = {2, 9 ,5 ,7 ,1 ,4, 9, 6, 15, 3};
        System.out.println("Задание 4.");
        System.out.println("Исходный массив: " + Arrays.toString(array4));
        System.out.println("Максимальное значение: " + maxarray(array4));
        System.out.println("Минимальное значение: " + minarray(array4));
        System.out.println();

        int[][] array5 = new int[7][7];
        System.out.println("Задание 5.");
        diagonal(array5);
        print2Array(array5);

    }


    public static void oneIsNull(int[] array){
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1){
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }

    public static void filling(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i * 3 + 1;
        }
    }


    public static void double6(int[] array){
        for (int i = 0; i < array.length; i++)
            if(array[i] < 6){
                array[i] *= 2;
            }
    }

    public static int maxarray(int[] array){
        int max = array[0];
        for( int i = 0; i < array.length; i++)
            if(array[i] > max){
                max = array[i];
        }
     return max;
    }

    public static int minarray(int[] array){
        int min = array[0];
        for( int i = 0; i < array.length; i++)
            if(array[i] < min){
                min = array[i];
            }
        return min;
    }


    public static void diagonal(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array.length; k++)
                if(i + k == array.length - 1 || i == k){
                    array[i][k] = 1;
            }
        }
    }

    public static void print2Array(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array.length; k++){
                System.out.print(array[i][k] + "\t");
            }
            System.out.println();
        }
    }

}
