package com.rk.me;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arrayData = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Data Ke : ");

        int indexInput = userInput.nextInt();

        /* Exception Biasa */
        System.out.println("Exception Biasa");
        try {
            System.out.printf("Data dari array ke %d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }

        /* Exception di Dalam Fungsi */
        System.out.println("\nException Di Dalam Fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("Data dari array ke %d adalah %d\n\n", indexInput, data);

        /* Exception Throw by Method */
        System.out.println("Exception Throw by Method");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.printf("Data dari array ke %d adalah %d\n\n", indexInput, data2);


        System.out.println("Akhir dari Program");
    }

    private static int ambilDataDariArray(int[] array, int index) {
        int hasil = 0;

        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    }

    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }


}

/*
    Melakukan Perantaian terhadap exception

 */