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
		/*
		 Scanner sc = new Scanner(System.in);
		int[] dataArray = new int[5];
		int num;
		double sum = 0;

		// 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드
		for (int i = 0; i < dataArray.length; i++) {
			num = sc.nextInt();
			dataArray[i] = num;
		}

		// 배열에 저장된 정수 값 더하기
		for (int i = 0; i < dataArray.length; i++) {
			sum = sum + dataArray[i];
		}

		// 평균값 출력
		System.out.println("평균은 " + sum / dataArray.length + " 입니다.");

		sc.close();
		 */
}
