package org.itstep.task04;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
    }

    public static int binarySearch(int[] arr, int key) throws Exep {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                throw new Exep ("Массив не отсортирован");
            }
        }

        return  binarySearch(arr, key, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int key, int indexLow, int indexHigh) {

        if (indexLow > indexHigh){
            return -1;
        }

        int index = (indexHigh + indexLow) / 2;
        if (key < arr[index]) {
            return binarySearch(arr, key, indexLow, index - 1);
        }
        if (key > arr[index]) {
            return binarySearch(arr, key, index + 1, indexHigh);
        }
        return index;
    }
}