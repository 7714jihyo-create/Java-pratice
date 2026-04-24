package javastart;

public class Var2 {
	public static void main(String[] args){
		final double PI = 3.14; //final: 불변
		double res1 = PI*10;
		System.out.println(res1);
		
		//var: 자동으로 변수의 타입(형)을 인식, 초기값을 보고 판단
		var x = 5;
		System.out.println(x++ + ++x);
		//왼쪽 x는 5 -> 뒤 x는 ++해서 6 -> ++해서 7-> 5+7
		System.out.println(2*1500+300+" hello");
		var k = 30.5;
		var y = 12.3f;
		var n = "java";
		System.out.println(x+" "+k+" "+y+" "+n);
	}
}
