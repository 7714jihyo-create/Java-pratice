package exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
	
		try {
			int n=sc.nextInt(); //정수 입력
			if(n%2==0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
		}
		catch (InputMismatchException e) { //입력한 문자 타입이 선언한 타입과 안 맞을 때
			// TODO: handle exception
			System.out.println("다시 입력");
		}
		finally { //예외 여부 관계없이 항상 실행
			System.out.println("프로그램 종료");
			sc.close();
		}
	}

}
