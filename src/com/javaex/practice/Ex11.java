package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 입력받은 숫자 = 홀수 / 입력값까지 홀수의 합 출력
		// 입력받은 숫자 = 짝수 / 입력값까지 짝수의 합 출력
		// '+=' 연산자를 활용못해서 1시간을 삽질
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result = 0;
		
		if(num%2==1) {
			for(int odd = 1; odd<=num; odd+=2) {
				result += odd;
			}
		}else {
			for(int even = 2; even<=num; even+=2) {
				result += even;
			}
		}
		System.out.println("결과값: " + result);
			
		sc.close();
		
		
	}

}
