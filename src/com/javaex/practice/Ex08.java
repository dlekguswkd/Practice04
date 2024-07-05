package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또(중복체크 할 것)
		//중복체크 (참고해서 했음)-또 해보기
		
		int[] noArr= new int[6];
		
		for (int i=0; i<noArr.length; i++) {
			noArr[i]=(int)(Math.random()*45)+1;
			
			// 중복검사
			// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
			// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
		
			for (int j=0; j<i; j++) {
				if(noArr[i]==noArr[j]) {
					i--;
					break;
				}
			}System.out.println(noArr[i]);

		}
		/*
		 for (int j = 0; j < no.length; j++) {
			System.out.print(no[j] + "  ");
		}
		 */
		
	}

}
