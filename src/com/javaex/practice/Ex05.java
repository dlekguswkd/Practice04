package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);
		double [] nArr = new double[5];
		double n=0;  //평균
		
		for (int i=0; i<nArr.length; i++) {
			nArr[i]= sc.nextDouble();
			n=n+nArr[i];
		}
		System.out.println("평균은 " + n/5 + " 입니다.");
		sc.close();
	}
		
}
