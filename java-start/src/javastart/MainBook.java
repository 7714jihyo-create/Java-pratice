package javastart;

class Book{
	//클래스 = 멤버변수(필드) + 메서드(기능) 구성
	String title; //멤버변수
	int price; //멤버변수
	//메서드 정의(기능, 행위)
	//생성자 오버로딩
	Book(String t, int p){ //생성자 = 클래스 이름 동일, 객체 생성시 인자(값) 2개
		title = t;
		price = p;
	}
	
	Book(String t){ //객체 생성시 인자 1개
		title = t;
		price = 0;
	}
	
	Book(){ //객체 생성시 인자 0개
		title="C언어의 정석";
		price=0;
	}
	
	void showPrice(){
		System.out.println("도서 제목: "+title+", "+"가격: "+price);
	}
}


public class MainBook { //실행하는 클래스

	public static void main(String[] args) { //main method
	
		Book myBook = new Book("자바의 정석", 20000);//객체(인스턴스) 생성
		Book myBook2 = new Book("파이썬 정석");
		Book myBook3 = new Book();
		//Book(): 클래스
		//new: 객체 생성 연산자
		// myBook: 참조변수, 객체 생성
		
		//myBook.title = "자바의 정석";
		//myBook.price= 20000; 
		
		myBook.showPrice();
		myBook2.showPrice();
		myBook3.showPrice();

	}
	
}
