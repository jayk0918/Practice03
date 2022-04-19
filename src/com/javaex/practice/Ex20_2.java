package com.javaex.practice;

import java.util.Scanner;

public class Ex20_2 {

	public static void main(String[] args) {
		// switch-case 활용
		
		Scanner sc = new Scanner(System.in);
		
		boolean game = true;
		// 이후에 올 switch-case문에서 while_true를 while_false로 전환하여 종료하고자 변수 선언
		
		while(game) {		
			System.out.println("답안 작성");
			int answer = sc.nextInt();
			System.out.println("==============");
			System.out.println("숫자맞추기게임 시작");
			System.out.println("==============");
			
			while(true) {
				System.out.print(">>");
				int guess = sc.nextInt();
				//guess가 while문 안에 들어가야 무한루프 방지
				//(밖에서 선언하면 if문 판정 이후 같은 값으로 무한 판정)
				if(answer==guess) {
					System.out.println("맞았습니다.");
					break;
				}else if(answer>guess) {
					System.out.println("더 높게");
				}else {
					System.out.println("더 낮게");
				}
			}// 정답추측 while문 종료
			
			sc.nextLine(); // 위에서 int 입력값을 엔터를 치면서 추가입력되는 버그로 아래 코드가 지장을 받은 것
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			String retry = sc.nextLine(); //sc.next vs sc.nextLine? -> 이것의 문제는 아님
			//참고
			//sc.next(); -> 용도 : 문자 혹은 문자열을 공백기준으로 한 단어 또는 한 문자씩 입력을 받음
			//ex) "안녕 하세요"에서 "안녕"만 받음
			//sc.nextLine(); -> 용도 : 엔터를 치기 전까지의 모든 문장 전체를 받음
			//ex) "안녕 하세요"에서 "안녕 하세요" 다 받음
			
			switch(retry) {
				case "y":
					System.out.println("==============");
					System.out.println("숫자맞추기게임 종료");
					System.out.println("==============");
					game = false;
					break;
					
				case "n":
					continue;
			}
			
		}//main-game while문 종료
		sc.close();
	}//method main 종료

}// class 종료
