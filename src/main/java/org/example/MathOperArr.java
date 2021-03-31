package org.example;

public class MathOperArr {

    public static int min (int[] arr) {
        int minNumber = arr[0];
        for (int i =0;i<arr.length-1;i++) {
            if (minNumber>arr[i]) {
                minNumber=arr[i];
            }
        }
        return minNumber;
    }
    public static int max (int[] arr) {
        int maxNumber = arr[0];
        //Сокращенная запись цикла по массиву. Тут i - это будет не индекс, а значение элемента массива
        for (int i:arr) {
            if (maxNumber<i) {
                maxNumber=i;
            }
        }
        return maxNumber;
    }
    public static int agr (int[] arr) {
        int currentSum = arr[0];
        for (int i =0;i<arr.length-1;i++) {
            currentSum+=arr[i];
        }
        return currentSum/arr.length;
    }

    public static int  countEvenNumbers (int[] arr) {
        int currentSum = 0;
        for (int i =0;i<arr.length-1;i++) {
            if (arr[i]%2==0) {
                currentSum++;
            }
        }
        return currentSum;
    }
}
