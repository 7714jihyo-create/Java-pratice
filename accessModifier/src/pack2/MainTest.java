package pack2;

import pack1.Parent;
public class MainTest {

	public static void main(String[] args) {
		Parent pa =new Parent();
		Child ch =new Child();
		
		System.out.println("=== 일반 객체 접근 ===");

        System.out.println("public a = " + pa.a); 
        //System.out.println("protected b = " + pa.b); 
        //System.out.println("default c= " + pa.c); 
        //System.out.println("private d  = " + pa.d); 

        // 자식 클래스 접근
        ch.printChild();

	}
}
