package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// !(팩토리얼)
		// n! = 1*2*3*~n
		// 숫자값 입력받고 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result = 1;
		
		for(int fac=1; fac<=num; fac++) {
			result *= fac;
		}
		
		System.out.print("결과값: " + result);
		
		sc.close();
	}

}
