
public class UsingThisExample {
	public static void main(String[] args) {
		//UsingThis 외부 클래스 객체 생성하고, 외부 클래스 안의 Inner 내부 클래스 객체를 생성해서 m() 메서드를 호출하는 과정을 만들어 보자.	
		
		UsingThis us = new UsingThis();
		UsingThis.Inner in = us.new Inner();
		
		in.m();
		
	}
}
