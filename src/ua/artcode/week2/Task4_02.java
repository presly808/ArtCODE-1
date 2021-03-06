package ua.artcode.week2;

import java.util.Arrays;

/**
 * Created by Serhii Fursenko on 02.06.16.
 */
public class Task4_02 {

    public static void main(String[] args) {
        /*
        2) Поменять местами наибольший и наименьший элементы в массиве
         */
        int [] mas = new int[]{2,1,23,23,1,200,51,-12,235,-4,-123, 121};
        System.out.println(Arrays.toString(mas));
        int minValue, maxValue, minValuePos=0, maxValuePos=0;
        minValue=Integer.MAX_VALUE;
        maxValue=Integer.MIN_VALUE;
        for(int i=0; i<mas.length; i++) {
            if(mas[i]>maxValue) {
                maxValue = mas[i];
                maxValuePos = i;
            }
            if(mas[i]<minValue) {
                minValue = mas[i];
                minValuePos = i;
            }
        }

        int temp = mas[minValuePos];
        mas[minValuePos] = mas[maxValuePos];
        mas[maxValuePos] = temp;

        System.out.println(Arrays.toString(mas));



    }
}
