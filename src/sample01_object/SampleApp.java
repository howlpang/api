package sample01_object;

public class SampleApp {
	public static void main(String[] args) {
		
		Sample sample = new Sample(100, "홍길동");
		Sample sample2 = new Sample(100, "홍길동");
		
		//toString() 메소드를 실행해서 객체에 대한 간단한 정보를 반환받을 수 있다.
		System.out.println("toString() -> " +sample.toString());
		System.out.println("toString() -> " +sample);
		
		//hashCode() 메소드를 실행해서 객체의 해시코드값을 반환받을 수 있다.
		/*
		 * 해쉬코드: 
		 * 		   해쉬 알고리즘에 의해서 생성되는 정수값이다.
		 * 		   두 객체가 서로 같은 객체면, 두 객체의 해쉬코드값은 동일해야 한다.
		 * 		   두 객체가 서로 다른 객체면, 두 객체의 해쉬코드값은 서로 다른 값을 반환하면 좋다.(같은 값이어도 상관없다.)
		 */
		
		int hash = sample.hashCode();
		int hash2 = sample2.hashCode();
		System.out.println("해쉬코드 -> " + hash);
		System.out.println("해쉬코드 -> " + hash2);
	
		
	}
}
