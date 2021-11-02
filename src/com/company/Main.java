package com.company;

public class Main {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();

    }

    public static void invertArray() {

        int[] arr = new int[] {1, 1, 0, 1, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {

        int[] arr = new int[8];

        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i*3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {

        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i]*2 : arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}
