package codeup_algorithm_study.basic100;

import java.util.Scanner;

public class No1014_기초_입출력_문자2개_입력받아_순서_바꿔_출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		a = sc.next();
		b = sc.next();
		System.out.printf("%s %s", b, a);
		sc.close();
	}
}
