package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		// 숫자 1개 입력 & 5의 배수의 개수+합을 출력
		// ex. 22는 5의 배수 4개 & 5의 배수 합 : 50
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			if(i%5==0) {
				count += 1;
				sum += i;
			}
		}
		System.out.println("5의배수의 개수: " + count);
		System.out.println("5의배수의 합: " + sum);
		
		sc.close();
		
		
	}

}
