package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		// Ex03 아래코드의 출력값을 예상하고 코드로 확인해 보세요.
		
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;		// 같은 주소를 공유하겠다 (같은공간 공유)
		intB[0]=20;			// intA ->{20,6,9}
		intB[2]=10;			// intA ->{20,6,10}
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		} 	// 20
			// 6
	}		// 10
	
}
