package Chap01;

import java.util.Scanner;
//1)실습 1-3. 입력한 정수 값이 양수인지 음수인지 0인지 판단합니다.

public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("이 수는 양수입니다.");
		}
		else if(n < 0) {
			System.out.println("이 수는 음수입니다.");
		}
		else {
			System.out.println("이 수는 0입니다.");
		}
		sc.close();
	}

}
