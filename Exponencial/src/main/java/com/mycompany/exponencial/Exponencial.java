package com.mycompany.exponencial;

import java.util.Scanner;

public class Exponencial {

    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la base: ");
		int b = teclado.nextInt();
		System.out.print("Introduce el exponente: ");
		int exp = teclado.nextInt();
		teclado.close();
		System.out.printf("%n%d elevado a %d es igual a %.3f", b, exp, potencia(b, exp));
	}
		
	private static double potencia(int b, int exp){
		if(exp==0){
			return 1;
		} else if (exp<0) {
			return potencia(b, exp+1) / b;
		} else {
			return b * potencia(b, exp-1);
		}
        }
}
