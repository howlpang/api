package sample07_generic;

public class GenericBoxApp {

	public static void main(String[] args) {

		GenericBox<String> box1 = new GenericBox<>();
		/*
		 * class Generic<T> {
		 * 			T item;
		 * 			T getItem() { return item;}
		 * 			void setItem(T item) { this.item = item;}
		 * }
		 * 
		 * 실제 생성한 객체의 코드	
		 * class Generic<String> {
		 * 			String item;
		 * 			String getItem() {return item;}
		 * 			void setItem(String item) {this.item = item;}
		 * }
		 */
		box1.setItem("홍길동");
		//box1.setItem(100); String 타입만 담을 수 있으므로 정수형 타입은 담을 수 없다. - > 코딩과정에서 타입검사가 가능해짐
		
		String value = box1.getItem(); // 클래스형변환 연산자를 사용할 필요가 없다.
		System.out.println(value);

	}

}
