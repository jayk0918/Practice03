package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		// 출력결과 예상하기
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("================");
		
		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
	}
}
/* 	1
	2
	3
	4
 ======
	8
	6
	4
	2 	예상*/

// 10 누락 / i-2가 다음에 적용되는데 자꾸 잊음