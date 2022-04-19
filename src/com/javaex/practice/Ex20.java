package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 숨겨진 숫자를 맞추는 게임
		// 랜덤 X, 임의의 숫자를 정하고 숫자를 변경해 테스트
		// 질문한 숫자가 결정된 숫자보다 높으면 "더 낮게", 낮으면 "더 높게"
		// 정답을 맞춘경우 "맞았습니다"
		// 게임반복을 위해 y/n이라 묻고 n인 경우 종료, y면 게임 다시 시작
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("답안입력");
		int answer = sc.nextInt();
		
		System.out.println("======================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("======================");
		
		System.out.print(">>");
		while(true) {
			int guess = sc.nextInt();
			
			if(guess>answer) {
				System.out.println("더 낮게");
			}else if(guess<answer) {
				System.out.println("더 높게");
			}else{
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String retry = sc.nextLine();
				sc.nextLine();
				if(retry == "y"){
					System.out.println("======================");
					System.out.println("   [숫자맞추기게임 종료]   ");
					System.out.println("======================");
					break;
				}else if(retry == "n"){
					
				}
			}
		}
		sc.close();
		}
	}
	
}

