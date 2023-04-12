package sample07_generic;

public class NoneGenericBoxApp {

	public static void main(String[] args) {

		// 문자열을 담을 수 있는 NoneGenericBox객체 생성하기
		NoneGenericBox box1 = new NoneGenericBox();
		// 박스객체에 문자열 저장하기
		box1.setItem("홍길동");
		
		//박스객체에 저장된 문자열 조회하기
		//box.getItem()의 반환값은 Object객체의 주소값임
		//원래 저장한 String타입으로 반드시 형변환해야한다.
		String value = (String) box1.getItem();
		System.out.println("박스에 저장했던 값 -> " +value);
	}

}
