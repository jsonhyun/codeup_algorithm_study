package codeup_algorithm_study.basic100;

import java.util.Scanner;

public class No1013_기초_입출력_정수2개_입력받아_그대로_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.printf("%d %d", a, b);
		sc.close();
	}
}
