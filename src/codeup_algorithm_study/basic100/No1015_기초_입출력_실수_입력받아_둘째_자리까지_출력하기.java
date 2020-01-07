package codeup_algorithm_study.basic100;

import java.util.Scanner;

public class No1015_기초_입출력_실수_입력받아_둘째_자리까지_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.printf("%.2f", a);
		sc.close();
	}
}
