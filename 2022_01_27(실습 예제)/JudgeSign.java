package Chap01;

import java.util.Scanner;
//1)�ǽ� 1-3. �Է��� ���� ���� ������� �������� 0���� �Ǵ��մϴ�.

public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("�� ���� ����Դϴ�.");
		}
		else if(n < 0) {
			System.out.println("�� ���� �����Դϴ�.");
		}
		else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		sc.close();
	}

}
