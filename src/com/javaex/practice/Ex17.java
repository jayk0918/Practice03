package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int starY = num; starY>=1; starY--) {
			for(int starX = starY; starX>=1; starX--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
		
		
	}

}
