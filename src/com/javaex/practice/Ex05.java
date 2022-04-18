package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// 출력결과 예상하기	
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
	}
}

//예상
/*	1
 * 	2
 * 	3
 * 	4
 * 	5
 * 	flase면 반복문 탈출 */
