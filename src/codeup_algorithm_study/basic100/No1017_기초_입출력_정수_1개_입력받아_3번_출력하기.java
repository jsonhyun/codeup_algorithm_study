package codeup_algorithm_study.basic100;

import java.util.Scanner;

public class No1017_기초_입출력_정수_1개_입력받아_3번_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a, a, a);
		sc.close();
	}
}
