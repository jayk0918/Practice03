package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// 설계 :
		// 1~10 (x축)이 y축 시작값에 따라 1씩 올라가는 수열
		// 기준을 x축으로 삼고, x 초기화 값을 1, y 초기화 값을 0으로 설정
		// x+y를 10회 반복(x<=10)하여 한 줄 완성
		// y축은 최초 1회 출력을 제외하고 계산하여 반복 (y<10)
		// 줄을 내리기 위해 println 투입
		
		for(int y = 0; y<10; y++) {
			for(int x = 1; x<=10; x++) {
				System.out.print(x + y + "\t");
			}
			System.out.println();
		}
		
	}

}
