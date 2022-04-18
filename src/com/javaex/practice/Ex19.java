package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 은행프로그램
		// 1. 예금 -> 금액입력 -> 예금액 합산
		// 2. 출급 -> 금액입력 -> 예금액 차감
		// 3. 잔고 -> 현재 잔고 출력
		// 4. 종료 -> 종료
		// 1~4 이외 숫자 : 다시입력해주세요 메시지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("예금액>");
				deposit = sc.nextInt();
				balance += deposit;
			}else if(choice == 2) {
				System.out.print("출금액>");
				withdraw = sc.nextInt();
				balance -= withdraw;
			}else if(choice == 3) {
				System.out.println("잔고액>" + balance);
			}else if(choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
		}
		
		sc.close();
		
		
	}

}
