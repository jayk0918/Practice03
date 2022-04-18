package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// 1~100까지의 수에서 5의 배수이면서 7의 배수인 수를 출력
		
		for(int num = 1; num<=100 ; num++) {
			if(num%5==0 && num%7==0) {
				System.out.println(num);
			}
		}
	}
}
