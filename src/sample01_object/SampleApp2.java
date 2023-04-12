package sample01_object;

public class SampleApp2 {

	public static void main(String[] args) {
		
		Sample sample1 = new Sample(100, "홍길동");
		Sample sample2 = new Sample(100, "홍길동");
		Sample sample3 = new Sample(200, "김유신");
		Sample sample4 = new Sample(200, "김유신");
		
		
		
		/*
		 * 객체의 비교
		 * 동일성 비교
		 * 			- 객체의 주소값을 비교해서 같은 객체인지 비교하는 것	
		 * 			- 참조변수가 참조하는 객체가 같은 객체를 참조하고 있을 때만 true다.
		 * 			- 비교연산자 == 은 객체에 대해서 동일성을 비교한다.
		 * 			-Object의 equlas(Object obj)는 객체에 대해서 동일성을 비교한다.
		 * 동등성 비교
		 * 			- 객체의 내용을 비교해서 같은 객체인지 비교하는 것
		 * 			-객체의 멤버변수에 저장된 값이 서로 같으면 true다.
		 * 			-Object의 hashCode()와 equlas(Object obj)를 재정의하면 동등성 비교를 수행할 수 있다.
		 */
		
		
		//동일성 비교
		System.out.println(sample1 == sample2);
		System.out.println(sample3 == sample4);
		
		
		// equlas(Object obj)로 객체의 동등성 비교하기
		System.out.println(sample1.equals(sample2));
		System.out.println(sample3.equals(sample4));
		
		
	}

}
