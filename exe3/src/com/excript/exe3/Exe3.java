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
		
		System.out.println("Digite qual operação você deseja fazer: ");
		System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		op = in.nextInt();
		
		
		if (op == 1) {
			
			System.out.println("Você Escolheu Soma!");
			
			System.out.println("Digite o valor 1: ");
			soma1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			soma2 = in.nextDouble();
			
			somatotal = soma1 + soma2;
			
			System.out.printf("A soma de %.1f e %.1f é : %.1f", soma1, soma2, somatotal);
			
			
		} else if (op == 2) {
			
			System.out.println("Você Escolheu Subtração!");
			
			System.out.println("Digite o valor 1: ");
			sub1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			sub2 = in.nextDouble();
			
			subtotal = sub1 - sub2;
			
			System.out.printf("A subtração de %.1f e %.1f é : %.1f", sub1, sub2, subtotal);
			
		} else if (op == 3) {
			
			System.out.println("Você Escolheu Multiplicação!");
			
			System.out.println("Digite o valor 1: ");
			mult1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			mult2 = in.nextDouble();
			
			multtotal = mult1 * mult2;
			
			System.out.printf("A multiplicação de %.1f e %.1f é : %.1f", mult1, mult2, multtotal);
			
		} else if (op == 4) {
			
			System.out.println("Você Escolheu Divisão!");
			
			System.out.println("Digite o valor 1: ");
			div1 = in.nextDouble();
			
			System.out.println("Digite o valor 2: ");
			div2 = in.nextDouble();
			
			divtotal = div1 / div2;
			
			System.out.printf("A divisão de %.1f e %.1f é : %.1f", div1, div2, divtotal);
			
		} else {
			
			System.out.println("Digite uma opção válida!");
			
		}
		
		in.close();
	}
	
}
