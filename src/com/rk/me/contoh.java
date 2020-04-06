package com.rk.me;

import java.io.FileInputStream;
import java.io.IOException;

public class contoh {
    public static void main(String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("Input.txt");
        System.out.println((char) inputFile.read());

        System.out.println("Akhir Dari Program");
    }
}
