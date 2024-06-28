package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		//Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로 확인해 보세요.

		/*
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;
		
		int result = 0;
		
		for (int i=0; i<=intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}*/
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;
		//나머지 두개는 값을 정해주지않아서 그냥 0으로 입력되어있음
		int result = 0;
		
		for (int i=0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

	//범위는 5개까지 밖에 없는데 <= 이렇게 하면 하나가 더 많아서 오류가 뜸 범위가 더 크기때문에
	// 3-> (3+7) -> 10+12 ->22 +0 ->22+0 -> 22
}
