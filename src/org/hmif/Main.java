package org.hmif;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here


        // If- ELse
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan nilai :");
//        int nilai = scanner.nextInt();
//
//        String hasil;
//        if ( nilai > 65){
//            hasil = "Lulus";
//        }else {
//            hasil = "Gagal";
//        }
//        System.out.println(hasil);

        // If - Else if

/*
        String hasil2;
        System.out.print("Masukkan string abjad :");
        String nilai2 =  scanner.nextLine();

        if (nilai2.equals("A") && nilai2.length() == 1){
            hasil2 = "Lulus dengan sempurna";
        }else if (nilai2.equals("B")){
            hasil2 = "Lulus dengan baik";
        }else if (nilai2.equals("C")){
            hasil2 = "Lulus tapi mepet";
        }else {
            hasil2 = "Tidak lulus";
        }

        System.out.println(hasil2);
*/


//        System.out.print("Masukkan string abjad :");
//        String nilai3 = scanner.nextLine();
//        String hasil3;
//
//        switch (nilai3) {
//            case "A" :
//                hasil3 = "Lulus dengan sempurna";
//                break;
//            case "B" :
//                hasil3 = "Lulus dengan baik";
//                break;
//            case "C" :
//                hasil3 = "Lulus tapi mepet";
//                break;
//            default:
//                hasil3 = "Tidak lulus";
//        }
//
//        System.out.println(hasil3);


        System.out.print("Masukkan nilai :");
//        int nilai4 = scanner.nextInt();
//        String hasil4;

//        if (nilai4 > 60) {
//            hasil4 = "Lulus";
             // process
//        }else {
//            hasil4 = "tidak lulus";
              // process
//        }
//
//        hasil4 = nilai4 > 60 ? "Lulus" : "tidak lulus";
//
//        System.out.println(hasil4);
//



        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        Arrays.sort(arr);



//        bubbleSort(arr);
//        System.out.println("Sorted array");
        printArray(arr);



    }


    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
