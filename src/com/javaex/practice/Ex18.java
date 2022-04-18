package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 별찍기 - wave
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		char star = '*';
		
		// 별 1개까지의 코드 (3일때 3-2-1 순서)
		
		for(int y = num; y>=1; y--) {
			for(int x = y; x>=1; x--) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		// 별 2개 찍히기 시작하는 코드 (2-3 역순)
		
		
		for(int y = 1; y<=num; y++) {
			for(int x = 0; x<=y; x++) {
				System.out.print(star);
			}
			System.out.println();
		}
		sc.close();
		
	}

}
