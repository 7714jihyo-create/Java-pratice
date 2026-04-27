package exceptionex;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		
		try {
			System.out.println("연산을 합니다");
			int result=a/b;
			System.out.println("결과는: "+result);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println("메시지: "+e.getMessage());
		}
		finally {
			System.out.println("종료");
		}
	}

}
