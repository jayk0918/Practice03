package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		// 설계 : 구구단 단을 x(n단), y(*n)축으로 지정
		// 출력이 가로로 이루어지므로 x(n단)의 숫자를 늘리며 출력설계
		// x, y 모두 9를 한계값으로 책정
		// 미관상 구분을 짓기 위해 "\t"(tab) 추가
		
		for(int danY = 1; danY<=9; danY++) {
			for (int danX = 2; danX<=9; danX++) {
				int result = danX * danY;
				System.out.print(danX + "*" + danY + "=" + result + "\t");
			}
			System.out.println();
		}
		
		
	}

}
