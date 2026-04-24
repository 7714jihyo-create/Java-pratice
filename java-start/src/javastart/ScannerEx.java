package javastart;

import java.util.Scanner; // java.util: 패키지, Scanner: 클래스

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 객체 생성
		// Scanner : 클래스 이름
		// System.in : 키보드로 입력
		// Scanner  sc -> Scanner(클래스, 타입(형)), sc -> 참조변수
		
		System.out.print("이름 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("주소를 입력하세요: ");
		String add = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("체중을 입력하세요: ");
		double wei = sc.nextDouble();
		
		System.out.print("결혼 여부: (true/false)");
		boolean marry = sc.nextBoolean();
		
		System.out.println("이름:"+ name);
		System.out.println("주소:"+ add);
		System.out.println("나이:"+ age);
		System.out.println("체중:"+ wei);
		System.out.println("결혼유무:"+ marry);
		
		sc.close(); //입력도구 종료, 자원정리
		
	}
	
}
 