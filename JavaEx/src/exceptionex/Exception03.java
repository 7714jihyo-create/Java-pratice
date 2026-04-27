package exceptionex;

public class Exception03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,2};
			System.out.println(a[5]);
			
			String str=null;
			System.out.println(str.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스 범위를 벗어났습니다");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null 레퍼런스 참조 에러");
		}
		catch (Exception e) { //Exception: 모든 예외일 때, 항상 마지막
			// TODO: handle exception
			System.out.println("기타 에러");
		}
		finally {
			System.out.println("종료");
		}
	}

}
