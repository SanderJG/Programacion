package com.mycompany.fibonacci;

import java.util.Scanner;


public class Fibonacci {
 public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Ingrese el nmero de fibonacci que desea consultar: ");
        int n= sc.nextInt(); // número de términos a calcular
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
