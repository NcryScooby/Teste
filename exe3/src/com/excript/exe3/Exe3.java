package com.excript.exe3;

import java.util.Scanner;

public class Exe3 {

	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int op;
		double soma1, soma2, somatotal;
		double sub1, sub2, subtotal;
		double mult1, mult2, multtotal;
		double div1, div2, divtotal;
		
		System.out.println("Digite qual opera��o voc� deseja fazer: ");
		System.out.println("1 - Soma\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o");
		op = in.nextInt();
		
		
		if (op == 1) {
			
			System.out.println("Voc� Escolheu Soma!");
			
			System.out.println("Digite o valor 1: ");
			soma1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			soma2 = in.nextDouble();
			
			somatotal = soma1 + soma2;
			
			System.out.printf("A soma de %.1f e %.1f � : %.1f", soma1, soma2, somatotal);
			
			
		} else if (op == 2) {
			
			System.out.println("Voc� Escolheu Subtra��o!");
			
			System.out.println("Digite o valor 1: ");
			sub1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			sub2 = in.nextDouble();
			
			subtotal = sub1 - sub2;
			
			System.out.printf("A subtra��o de %.1f e %.1f � : %.1f", sub1, sub2, subtotal);
			
		} else if (op == 3) {
			
			System.out.println("Voc� Escolheu Multiplica��o!");
			
			System.out.println("Digite o valor 1: ");
			mult1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			mult2 = in.nextDouble();
			
			multtotal = mult1 * mult2;
			
			System.out.printf("A multiplica��o de %.1f e %.1f � : %.1f", mult1, mult2, multtotal);
			
		} else if (op == 4) {
			
			System.out.println("Voc� Escolheu Divis�o!");
			
			System.out.println("Digite o valor 1: ");
			div1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			div2 = in.nextDouble();
			
			divtotal = div1 / div2;
			
			System.out.printf("A divis�o de %.1f e %.1f � : %.1f", div1, div2, divtotal);
			
		} else {
			
			System.out.println("Digite uma op��o v�lida!");
			
		}
		
		in.close();
	}
	
}
