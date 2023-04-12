package sample06_math;

/*
 * 정적 import 구문
 *  - static 변수, static 메소드, static 내부 클래스를 import 시킨다.
 *  - java 5 부터 지원하는 기능이다.
 *  - static import 구문으로 포함시킨 변수, 메소드, 내부클래스는 클래스이름 없이 사용할 수 있다.
 *  - 예시	
 		* Math 클래스의 정적메소드 abs를 import한다.  	
 *  		import static java.lang.Math.abs;
 *  		수행문에서 사용하기
 *  			int 절대값 = abs(-100);   <---- Math.abs() 메소드 사
 *  	* Math 클래스의 모든 정적 구성요소를 import한다.
 *  		import static java.lang.Math.*;	
 *  		수행문에서 사용하기		
 *  			int 절대값 = abs(-100);    <--- Math.abs() 메소드 사용
 *  			int 큰값  =  max(100,90);		<--- Math.max() 메소드 사용 
 */
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.random;


public class MathApp1 {

	public static void main(String[] args) {
		//Math 클래스의 주요 메소드
		
		//절대값을 반환하는 메소드
		int value1 = abs(100);
		int value2 = abs(-100);
		double value3 = abs(3.14);
		double value4 = abs(-3.14);
		System.out.println("절대값1 -> "+ value1);
		System.out.println("절대값2 -> "+ value2);
		System.out.println("절대값3 -> "+ value3);
		System.out.println("절대값4 -> "+ value4);
		//큰 값을 반환하는 메소드
		int value5 = max(100,20);
		double value6 = max(2.145,10.4);
		double value7 = max(100,23.45);
		System.out.println("큰 값5 ->"+ value5);
		System.out.println("큰 값6 ->"+ value6);
		System.out.println("큰 값7 ->"+ value7);
		
		//작은 값을 반환하는 메소드
		int value8 = min(100,20);
		double value9 = min(2.145,10.4);
		double value10 = min(100,23.45);
		System.out.println("작은 값5 ->"+ value8);
		System.out.println("작은 값6 ->"+ value9);
		System.out.println("작은 값7 ->"+ value10);
		//반올림된 값을 반환하는 메소드
		long value11 = round(3.14);
		long value12 = round(3.5);
		long value13 = round(3.6);
		System.out.println("반올림값 -> "+ value11);
		System.out.println("반올림값 -> "+ value12);
		System.out.println("반올림값 -> "+ value13);
		
		//천정값(ceil값)을 반환하는 메소드
		double value14 = ceil(3.0);
		double value15 = ceil(3.1);
		double value16 = ceil(3.4);
		double value17 = ceil(3.8);
		double value18 = ceil(4.0);
		System.out.println("ceil 값 -> "+ value14);
		System.out.println("ceil 값 -> "+ value15);
		System.out.println("ceil 값 -> "+ value16);
		System.out.println("ceil 값 -> "+ value17);
		System.out.println("ceil 값 -> "+ value18);
		
		//바닥값(floor값)을 반환하는 메소드
		double value19 = floor(4.0);
		double value20 = floor(3.9);
		double value21 = floor(3.5);
		double value22 = floor(3.2);
		double value23 = floor(3.0);
		System.out.println("floor 값 -> "+ value19);
		System.out.println("floor 값 -> "+ value20);
		System.out.println("floor 값 -> "+ value21);
		System.out.println("floor 값 -> "+ value22);
		System.out.println("floor 값 -> "+ value23);
		
		
		//0보다 크거나 같고 1보다 작은 난수를 반환하는 메소드
		// (int) (random()*N) : 0보다 크거나 같고 N보다 작은 정수를 반환한다.
		// (int) (random()*N) +1 : 1보다 크거나 같고 N보다 작거나 같은 정수를 반환한다.
		System.out.println("난수 값 -> "+(int) (random()*6+1));
		System.out.println("난수 값 -> "+(int) (random()*100));
		System.out.println("난수 값 -> "+(int) (random()*1000));
		
		
		
	}

}
