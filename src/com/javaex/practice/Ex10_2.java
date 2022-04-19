package com.javaex.practice;

import java.util.Scanner;

public class Ex10_2 {

	public static void main(String[] args) {
		
		// 정수 5개를 입력받는 반복작업이므로 반복문이 사용가능
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max = 0;
		int num = 0;
		
		// for 5회 반복문 작성으로 숫자값을 5번 받도록 유도하고
		// for 하위문에 if문을 투입하여 입력한 num의 값이 max변수보다 크면 num값을 max에 투입
		
		for(int i = 1; i<=5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			if(num>max) {
				max = num;
			} 
		}// max<num이면 반복과정에서 언제든지 num이 max값으로 들어가며, num이 max보다 작으면 자연스럽게 배제됨
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();
	}
}
