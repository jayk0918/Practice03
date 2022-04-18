package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 숫자를 입력받고 출력
		// 설계 : 7이면 (x,y) = (1,1) ~ (7,7)출력
		// 출력되는 숫자는 y의 값들의 집합, 출력을 y로 하되 x값은 라인 표현에 집중
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int y = 1; y<=num; y++) {
			for(int x = 1; x<=y; x++) {
				System.out.print(y);
			}
			System.out.println();
		}
		sc.close();
		
		
	}

}
