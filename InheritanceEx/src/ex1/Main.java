package ex1;

public class Main {
	public static void main(String[] args) {
		Dog	d =new Dog();//자식 객체
				
		d.name="뽀삐";
		d.age=2;
		d.color="검정";
		
		System.out.println(d.name+","+d.age+","+d.color);
		
		d.eat();//부모
		d.sleep();//부모
		// 자식 클래스 메서드 호출	
		d.bark();//자식
		d.run();//자식
	}

}
