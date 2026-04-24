package javastart;

class Car{ //클래스(설계도) 생성
   //클래스 = 멤버변수(필드) + 메서드(기능) 구성
   String model; 
   int speed;
  
   Car(String model, int speed){ 
      this.model = model;
      this.speed = speed;      
   }
   Car(String model){ 
	      this.model = model;
	           speed = 0;      
	   }
   Car(){ 
	      model = "트럭";
	      speed = 0;      
	   }
   
   //메서드 정의(기능, 행위)
   void showPrint(){
      System.out.println("모델명: "+model+", "+"속도: "+speed);
   }
   
}


public class MainCar { //실행하는 클래스

   public static void main(String[] args) { //main method
   
      Car c1 = new Car("\"Sonata\"", 100); //객체(인스턴스) 생성
      Car c2 = new Car("\"Avante\"", 80); 
      Car c3 = new Car("Avante"); 
      Car c4 = new Car(); 
      
      
      c1.showPrint(); //메서드 호출    
    
      c2.showPrint();
      c3.showPrint();
      c4.showPrint();
      

   }
   
}