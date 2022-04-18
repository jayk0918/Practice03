package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		//출력결과를 예상하기
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
		}System.out.println("");
	}
}
/* 	**
  	**
  	**
  	** 예상
  	
  	오답 : 결과는 ********(가로 8개)
  	이유 : prinln은 위에 for문의 밖에 있기 때문에 출력은 되었으나 보이지가 않음
  		만약 *을 내릴 의도가 있었다면 for문 안쪽에 위치했어야 함
  	
 */
