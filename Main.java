package com.company.java_core.homework1.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        int min = 0;
        int max = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);
            if(array[i] > max){
                max = array[i];
            } else if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Minimal = " + min);
        System.out.println("Maximal = " + max);
    }
}
